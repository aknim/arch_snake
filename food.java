/*
Primitive Obsession Vs Data Transfor Object(DTO) or Value Object

Primite Operation: having x, y vs cell passed as input
DTO: can use cell as object passed everywhere, without coupling problems, as it has zero behavior and compleely immutable(if made final?)
==> DTO can act as universal, lightweight standard currency 
*/
import java.util.Random; 
public class food{
 private cell newRandomPos;
 private cell coordinate;
 private Random random;
 private boolean alive;
 public food(cell xy){coordinate = new cell(xy.getX(), xy.getY()); random = new Random(); alive = true;}
 public cell getCoordinates(){return new cell(coordinate.getX(), coordinate.getY());}
 public cell generateRandomPos(int maxW, int maxH){
  newRandomPos = new cell(random.nextInt(maxW), random.nextInt(maxH));
  return newRandomPos;
 }
 public void moveToRandom(){
  coordinate = new cell(newRandomPos.getX(), newRandomPos.getY());
  resetRandomPos();
  alive = true;
 }
 private void resetRandomPos(){newRandomPos = null;}
 public void die(){coordinate = null; alive = false;} 
}
