public class gameComposite{
 private controller c;
 public gameComposite(String [][] map, int level, String gameName, int snakeSpeed, String snakeDrxn, cell snakeCoordinate, cell foodCoordinate, int tickInterval){
  inputListener i = new inputListener();
  c = new controller(new board(map), 
    i,
    new mainDisplayPanel(map[0].length, map.length, i),
//    new mainDisplay(), 
    new snake(snakeSpeed, snakeDrxn, snakeCoordinate), 
    new food(foodCoordinate), 
    new gameClock(tickInterval), 
    level, gameName); 
 }
 public void start(){ c.start();}
}
