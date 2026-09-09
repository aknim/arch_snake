public class main{
 public static void main(String [] args){
  int level = 1;
  String gameName = "Snake";
  int snakeSpd = 1;
  String snakeDrxn = "u";
  cell snakeCoordinate = new cell(3, 3);
  cell foodCoordinate = new cell(5,5);
  int tickInterval = 200;
  int w = 15;
  int h = 15; String [][] map = new String[h][w];
  for(int i=0;i<map.length;i++){
   for(int j=0;j<map[i].length;j++){
    map[i][j] = "e"; //empty
   }
  }
  gameComposite gc = new gameComposite(map, level, gameName, snakeSpd, snakeDrxn, snakeCoordinate, foodCoordinate, tickInterval);
  gc.start();
 }
}
