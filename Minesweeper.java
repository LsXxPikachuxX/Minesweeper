//Note: we mite have to make a superclass(for repeating the thing over and over again? idk)
import java.util.Scanner;

public class Minesweeper{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the length of the square mine field");
    int l = scanner.nextInt();
    int[][] bombField = getBombs(getBoard(l),((int)(l*l/10.0)));
  }
  
  //get the 2d grid based on user input from main method
  public static int[][] getBoard(int n){
    int[][] grid = new int[n][n];
    return grid;
  }

  //get the bomb grid based on number of bombs
  //Made it so that the 1 would be the x
  //Sorta made it really long tell me if u have a better way to do this
  public static int[][] getBombs(int[][] grid,int numBombs){
    int[][] ans = new int[grid.length][grid[0].length];
    for(int i = 0; i<numBombs; i++){
      int row = (int)(Math.random()*(grid.length-1));
      int col = (int)(Math.random()*(grid[0].length-1));
      if(ans[row][col]==0){
        ans[row][col]=1;
      }else{
        i--;
      }
    }
    return ans;
  }
  
  
}
