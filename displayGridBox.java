public class displayGridBox{
 private String foodSymbol = "🍔";
 private String emptySymbol = "⬜";
 private String snakeSymbol = "⬛";
 public void display(String [][] grid){
  for(int i=grid.length-1;i>=0;i--){
   for(int j=0;j<grid[i].length;j++){
    String toPrint = " ";
    switch(grid[i][j]){
     case "f": toPrint = foodSymbol; break;
     case "s": toPrint = snakeSymbol; break;
     case "e": toPrint = emptySymbol; break;
    }
    System.out.print(toPrint);
   }System.out.println(); 
  }
 }
}
