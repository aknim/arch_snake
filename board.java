public class board{
 private int w, h;
 private String [][] grid;
 public int getW(){return w;}
 public int getH(){return h;}
 public String [][] getGridData(){return grid.clone();}
 public board(String [][] map){ this.h = map.length; this.w = map[0].length; this.grid = map;}
 public boolean checkValidCoordinate(cell c){
  int x = c.getX(); int y = c.getY();
  return (x>=0 && x<w && y>=0 && y<h);
 }
}
