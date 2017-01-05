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
  
  //I feel like we should make 9 the bomb, it looks like a bomb and its impossible to get 9 surrounding bombs(max 8)
  //This is preety code efficient imo, this isnt long at all XD
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
  //BEFORE ANY TRASHING HEAR ME SAY ONE THING
  //I TRIED MY BEST
  //oh and this is just in case we dont know how to do it
  //feel free to replace it with a better one
  public static int getBombAround(int r, int c, int[][] arr){
    int ans = 1;
    if(r == arr.length && c==arr[0].length){
      ans= checkUp(r-1,c-1,arr)+checkUpLeft(r-1,c-1,arr)+checkLeft(r-1,c-1,arr);
    }else if(r == 1 && c==arr[0].length){
      ans= checkLeft(r-1,c-1,arr)+checkDown(r-1,c-1,arr)+checkDownLeft(r-1,c-1,arr);
    }else if(r == 1 && c==1){
      ans= checkRight(r-1,c-1,arr)+checkDownRight(r-1,c-1,arr)+checkDown(r-1,c-1,arr);
    }else if(r == arr.length && c==1){
      ans= checkUp(r-1,c-1,arr)+checkUpRight(r-1,c-1,arr)+checkRight(r-1,c-1,arr);
    }else if(r == arr.length){
      ans= checkUp(r-1,c-1,arr)+checkUpRight(r-1,c-1,arr)+checkRight(r-1,c-1,arr)+checkLeft(r-1,c-1,arr)+checkUpLeft(r-1,c-1,arr);
    }else if(r == 1){
      ans= checkLeft(r-1,c-1,arr)+checkDownLeft(r-1,c-1,arr)+checkDown(r-1,c-1,arr)+checkDownRight(r-1,c-1,arr)+checkRight(r-1,c-1,arr);
    }else if(c == arr[0].length){
      ans= checkUp(r-1,c-1,arr)+checkUpLeft(r-1,c-1,arr)+checkLeft(r-1,c-1,arr)+checkDownLeft(r-1,c-1,arr)+checkDown(r-1,c-1,arr);
    }else if(c == 1){
      ans= checkUp(r-1,c-1,arr)+checkUpRight(r-1,c-1,arr)+checkRight(r-1,c-1,arr)+checkDownRight(r-1,c-1,arr)+checkDown(r-1,c-1,arr);
    }else{
      ans= checkUp(r-1,c-1,arr)+checkUpRight(r-1,c-1,arr)+checkRight(r-1,c-1,arr)+checkDownRight(r-1,c-1,arr)+checkDown(r-1,c-1,arr)+checkDownLeft(r-1,c-1,arr)+checkLeft(r-1,c-1,arr)+checkUpLeft(r-1,c-1,arr);
    }
    return ans;
  }
  public static int checkUp(int r, int c, int[][] arr){
    int ans = 0;
    if(arr[r+1][c]==1)
      ans=1;
    return ans;
  }
  public static int checkUpRight(int r, int c, int[][] arr){
    int ans = 0;
    if(arr[r+1][c+1]==1)
      ans=1;
    return ans;
  }
  public static int checkRight(int r, int c, int[][] arr){
    int ans = 0;
    if(arr[r][c+1]==1)
      ans=1;
    return ans;
  }
  public static int checkDownRight(int r, int c, int[][] arr){
    int ans = 0;
    if(arr[r-1][c+1]==1)
      ans=1;
    return ans;
  }
  public static int checkDown(int r, int c, int[][] arr){
    int ans = 0;
    if(arr[r-1][c]==1)
      ans=1;
    return ans;
  }
  public static int checkDownLeft(int r, int c, int[][] arr){
    int ans = 0;
    if(arr[r-1][c-1]==1)
      ans=1;
    return ans;
  }
  public static int checkLeft(int r, int c, int[][] arr){
    int ans = 0;
    if(arr[r][c-1]==1)
      ans=1;
    return ans;
  }
  public static int checkUpLeft(int r, int c, int[][] arr){
    int ans = 0;
    if(arr[r+1][c-1]==1)
      ans=1;
    return ans;
  }
  
  //Methods we gotta make:
  // -method to mark the grid based on bombs, checking for edges as well. lots of testing is needed for this part. DID IT
  // -method for actually handling the game(main method, or something else). I can also do this part, or we mite have to work on it 
  // togather because it would take both our code.
  // -method for changing the display grid, because we need to change that one constantly
  // -more methods based on how we gunna do this.
}
