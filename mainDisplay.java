public class mainDisplay{
 private displayTimeBox dtb; private displayLevelBox dlb; private displayScoreBox dsb; private displayGameNameBox dgnb; private displayGridBox dgb; private displayInstructionsBox dib; 
 public mainDisplay(){ dtb = new displayTimeBox(); dlb = new displayLevelBox(); dsb = new displayScoreBox(); dgnb = new displayGameNameBox(); dgb = new displayGridBox(); dib = new displayInstructionsBox();}
 public void displayTime(String time){dtb.display(time);}
 public void displayLevel(int level){dlb.display(level);}
 public void displayScore(int score){dsb.display(score);}
 public void displayGameName(String name){dgnb.display(name);}
 public void displayGrid(String [][] grid){dgb.display(grid);}
 public void displayInstructions(String inst){dib.display(inst);}
 public void display(String time, int level, int score, String gameName, String [][]grid, String userInst){displayGameName(gameName);displayTime(time); displayLevel(level); displayScore(score); displayGrid(grid); displayInstructions(userInst); }
}
