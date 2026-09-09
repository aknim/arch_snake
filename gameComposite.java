public class gameComposite{
 private controller c;
 public gameComposite(String [][] map, int level, String gameName, int snakeSpeed, String snakeDrxn, cell snakeCoordinate, cell foodCoordinate, int tickInterval){
  c = new controller(new board(map), 
    new input(),
    new mainDisplay(), 
    new snake(snakeSpeed, snakeDrxn, snakeCoordinate), 
    new food(foodCoordinate), 
    new gameClock(tickInterval), 
    level, gameName); 
 }
 public void start(){ c.start();}
}
