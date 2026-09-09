import java.util.ArrayList; 
public class snake{
 private cell coordinate;
 private cell computedNextPos;
 private String drxn;
 private int spd;
 private ArrayList<cell> snakeBody;
 public snake(int spd, String drxn, cell coordinate){this.spd = spd; this.drxn = drxn; this.coordinate = coordinate;}
 public cell computeNextCoordinate(String mv){
  int x = -1; int y = -1;
  switch(mv){
   case "u": drxn = "u"; y = coordinate.getY()+1; x = coordinate.getX(); break;
   case "d": drxn = "d"; y = coordinate.getY()-1; x = coordinate.getX(); break;
   case "r": drxn = "r"; y = coordinate.getY(); x = coordinate.getX()+1; break;
   case "l": drxn = "l"; y = coordinate.getY(); x = coordinate.getX()+1; break;
  }
  computedNextPos = new cell(x, y);
  return computedNextPos;
 }
 public void moveToComputedCoordinate(String eaten){
  coordinate = new cell(computedNextPos.getX(), computedNextPos.getY());
  computedNextPos = null;
  snakeBody.add(0, coordinate);
  switch(eaten){
   case "f": break;
   default : snakeBody.removeLast();
  }
 }
}
