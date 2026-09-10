public class board{
 private int w, h;
 private String [][] grid;
 public int getW(){return w;}
 public int getH(){return h;}
 public String [][] getGridData(){
  String [][] tmpGrid = new String[grid.length][];
  for(int i=0;i<grid.length;i++){tmpGrid[i] = grid[i].clone();}
  return tmpGrid;
  }
 public board(String [][] map){ this.h = map.length; this.w = map[0].length; this.grid = map;}
 public boolean checkValidCoordinate(cell c){
  int x = c.getX(); int y = c.getY();
  return (x>=0 && x<w && y>=0 && y<h);
 }
}
