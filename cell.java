public final class cell{
 private int x, y;
 public cell(int x, int y){this.x = x; this.y = y;}
 public cell(cell other){this.x = other.getX(); this.y = other.getY();}
 public int getX(){return x;}
 public int getY(){return y;}
 public boolean equals(cell other){return other.getX()==x && other.getY()==y;}
}
