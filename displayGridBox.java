public class displayGridBox{
 public void display(String [][] grid){
  for(int i=0;i<grid.length;i++){
   for(int j=0;j<grid[i].length;j++){
    System.out.print(grid[i][j]);
   }System.out.println(); 
  }
 }
}
