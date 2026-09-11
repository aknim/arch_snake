public class controller{
 private board brd;
 private inputListener inp;
 private mainDisplayPanel disp;
 private snake snk;
 private food fd;
 private gameClock gmClck;
 private int score, level;
 private String gameName;
 private String userInstructions = "Press 'a' for left, ',' for up, 'o' for down, 'e' for right";
 public controller(board b, inputListener i, mainDisplayPanel d, snake s, food f, gameClock gc, int level, String gameName){
  this.brd = b; this.inp = i; this.disp = d; this.snk = s; this.fd = f; this.gmClck = gc; this.level = level; this.gameName = gameName;
  score = 0;
 }
 public void start(){
  while(true){
  String [][] tmpGrid = brd.getGridData();
  cell [] tmpCoordArr = snk.getCoordinates(); 
  for(int i=0;i<tmpCoordArr.length;i++){
   cell tmpCell = tmpCoordArr[i];
   tmpGrid[tmpCell.getY()][tmpCell.getX()] = "s";
  }

  cell tmpFoodCoord = fd.getCoordinates(); tmpGrid[tmpFoodCoord.getY()][tmpFoodCoord.getX()] = "f";
  //disp.display(""+gmClck.getTime(), level, score, gameName, tmpGrid, userInstructions);
  disp.updateGridFrame(tmpGrid);
  //inp.readUserIn();
  String in = inp.giveUserIn();
  if(in!=null){
  String mv = in;//"";
  /*switch(in){
   case "a": mv = "l"; break;
   case ",": mv = "u"; break;
   case "o": mv = "d"; break;
   case "e": mv = "r"; break;
  }*/
  cell snakeNextCord = snk.computeNextCoordinate(mv);
  String eaten = "";
  if (snakeNextCord.equals(fd.getCoordinates())) { eaten = "f";}
  if (brd.checkValidCoordinate(snakeNextCord)) {
   snk.moveToComputedCoordinate(eaten);
   if(eaten.equals("f")){
    score = score + 1;
    fd.die();
    while(true){
     cell foodNextCord = fd.generateRandomPos(brd.getW(), brd.getH());
     if (brd.checkValidCoordinate(foodNextCord)){
      fd.moveToRandom();
      eaten = "";
      break;
     } 
    }
   }
  }
  }
  gmClck.tick();
 }
 }
}
