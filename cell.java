public final class cell{
 private int x, y;
 public cell(int x, int y){}
 public int getX(){return x;}
 public int getY(){return y;}
 public boolean equals(cell other){return other.getX()==x && other.getY()==y;}
}
