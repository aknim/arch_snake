/*
$$$$$$$$$$$$$$$$$$
$$$Requirements$$$
$$$$$$$$$$$$$$$$$$


Rough description -
Each of these are display objects: GameNameBox, ScoreBox, LvlBox, TimeBox, GameGridBox. Each has responsibility of displaying the gameName, score, level, time, the entire game grid (with snake and food position and all). We have the main display object, which orchestrates their display. It has the responsibility of orchestrating them, when demanded by the controller object. We have then the snakecell, snake, food and foodcell objects. The snake cell and foodcell have responsibility of knowing their positions, and changing their positions or going off. The snake cell also have responsibility of knowing if it is the head. The snake has the responsibility of moving directions as commanded by the controller. So snake also has the responsibility of knowing its current direction. Snake also knows its current speed, and has responsibility of changing it, when commanded. There is input object, which takes in user input and gives to controller when commanded. The controller orchestrates the input to take in input, and give to it. The controller orchestrates by turning this input into a move, and tells the snake to move. The snake then moves by orchestrating its list of cells. The controller checks snake collision with dangerous things like wall, and appropriately lets the game continue, or stop or give warning, and updates score and orchestrates with display to display. The controller also orchestrates and checks if snake and food collided in right way, and accordingly increases score, and commands snake to increase size, and commands food to dissolve, and places a comand to generate food maybe immediately or after a while. And maybe there is a different clock object or ticker object, or maybe it is part of controller only, don't exactly know. Then there is composite object and main object. The main would create the composite object and start the game. the composite will on basis of information passed by main, would create different objects, inject into controller, and start the game.

*/

/* Other Points
* The snake saved as list, ensures head is know. So no need to store in cell, if it is snake head
* Dedicated GameClock
* Snakecell vs Foodcell: Both just a cell/point, which store their location  
*/

/*
Objects List

** ANEMIC DOMAIN MODEL: Its an anti-pattern. Breaks encapsulation. They just hold properties and values, without behaviors or methods. The public getter and setters would expsoe, making fully readable and writable.
 
x (not having cell in CRC) Cell: will be used for snake cell, and food cell both, instead of having different classes for each. This avoidse the ANEMIC DOMAIN MODEL. (don't make classes just for the sake of NAMING them if they hold raw structural coordinates)
* Snake: Ordered queue of body cells. Handles direction changes & vector shifts?
* Food: The single cell target
* Board: Grid 

* MainDisplay: The visual text rendering layout layers. It orchestrates the display boxes, as commanded by the controller
** ScoreBoxDisplay, LvlBoxDisplay, GameGridBoxDisplay, GameNameBoxDisplay (Single Responsibility & Interface segregation)

* Input: Reads input from user, when controller commands it

* GameClock: Time-tick generator
* Controller: The central processing referree
* GameComposite: The assembly floor root
* Main: Program launcher, which creates gamecomposite and starts it
*/

/*
**********
***food***
**********

* Knows: its location 
* Does: It pops up at a random position when asked, it gets removed when asked
* Collab: None
*/
/*
************
***Snake****
************

* Knows: Its head location, its body location, its direction, its speed, its computed position
* Does: computes next position when asked, moves in that position when confirmed  as asked
* Collab: None
*/

/*
***********
***Board***
***********

* Knows: Its size
* Does: validates a position
* Collab: 
*/

/*
*****************
***MainDisplay***
*****************

* Knows: 
* Does: When commanded, it displays time, level, score, game name
* Collab: None
*/

/*
***********
***Input***
***********

* Knows:
* Does: Reads user input, and gives what it is, when commanded
* Collab: None
*/

/*
***************
***gameClock***
***************

* Knows: currentTime
* Does: keeps ticking (& generates interrupt?)
* Collab:  None
*/

/*
*******************
***gameComposite***
*******************

* Knows:
* Does: creates mainDisplay, input, food, snake, board. Pass these to controller after creating it, and then starting it
* Collab: as mentioned in "does"
*/

/*
****************
***Controller***
****************

* Knows: input, maindisplay, snake, food, ground (ground, food & snake separate, so that ground maintains SRP of simply may)
* Does: orchestrates display to display score and ground/food/snake, orchestrates input to read user input and make moves accordingly, orchestrates snake to make move, food to appear, disappear
* Collab: all these mentoned in "knows"
*/

/*
**********
***main***
**********

simply creates the gameComposite, and sstarts it

*/
