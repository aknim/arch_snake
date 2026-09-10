import java.util.ArrayList; 
public class snake{
 //private cell coordinate;
 private cell computedNextPos;
 private String drxn;
 private int spd;
 private ArrayList<cell> snakeBody;
 public snake(int spd, String drxn, cell coordinate){this.spd = spd; this.drxn = drxn; snakeBody = new ArrayList<cell>(); snakeBody.add(new cell(coordinate.getX(), coordinate.getY()));}
 public cell[] getCoordinates(){
  cell[] tmpCoordinates = new cell[snakeBody.size()];
  for(int i=0;i<snakeBody.size();i++){
   tmpCoordinates[i] = new cell(snakeBody.get(i));
  }
  return tmpCoordinates;
 }
 public cell computeNextCoordinate(String mv){
  int x = -1; int y = -1; cell headCoordinate = snakeBody.get(0);
  switch(mv){
   case "u": drxn = "u"; y = headCoordinate.getY()+1; x = headCoordinate.getX(); break;
   case "d": drxn = "d"; y = headCoordinate.getY()-1; x = headCoordinate.getX(); break;
   case "r": drxn = "r"; y = headCoordinate.getY(); x = headCoordinate.getX()+1; break;
   case "l": drxn = "l"; y = headCoordinate.getY(); x = headCoordinate.getX()-1; break;
  }
  computedNextPos = new cell(x, y);
  return computedNextPos;
 }
 public void moveToComputedCoordinate(String eaten){
  cell newCoordinate = new cell(computedNextPos.getX(), computedNextPos.getY());
  computedNextPos = null;
  snakeBody.add(0, newCoordinate);
  switch(eaten){
   case "f": break;
   default : snakeBody.removeLast();
  }
 }
}
