/*
Primitive Operation Vs Data Transfor Object(DTO) or Value Object

Primite Operation: having x, y vs cell passed as input
DTO: can use cell as object passed everywhere, without coupling problems, as it has zero behavior and compleely immutable(if made final?)
==> DTO can act as universal, lightweight standard currency 
*/
public class food{
 private cell newRandomPos;
 private cell coordinate;
 public food(cell xy){}
 public cell getCoordinates(){}
 public cell generateRandomPos(){}
 public void moveToRandom(){}
 private void resetRandomPos(){}
 public void die(){} 
}
