package advjava;
//https://leetcode.com/problems/max-area-of-island/submissions/
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MaxAreaOfIsland {
	static int count;
	static int vrow;
	static int vcol;
	 public static int maxAreaOfIsland(int[][] grid) {
	        int result = 0;
	        int rowlen = grid.length;
	        int collen = grid[0].length;
			 int maxarea = 0;
			 int[][] visited = new int[rowlen][collen];
			 
			 for(int i=0; i < rowlen; i++) {
				 for(int j = 0; j < collen; j++) {
					 if(grid[i][j] == 1) {
						 count = 0;
						 //check all 4 directions 
						 visited[i][j] = grid[i][j];
						  result = check4D(grid,i,j,visited);
						  i = vrow;
						  j = vcol;
						  if(maxarea < result)
							  maxarea = result;
					 }
						 
				 }
			 }
			
	        return maxarea;
	        
	    }
	 
	 public static int check4D(int[][] grid, int row, int col, int[][] visited) {
		 if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == 0 || visited[row][col] == -1)
			 return count;
		 count++;
		 vrow = row;//vrow and vcol are used because after we navigate in all 4 directions the row and col will change and we want it to reflect back in the calling method. so declared them as static globally.
		 vcol = col;
		 visited[vrow][vcol] = -1;
		 check4D(grid, row+1, col,visited);//down
		 check4D(grid, row-1, col,visited); //up
		 check4D(grid, row, col+1,visited); //right
		 check4D(grid,row, col-1,visited); //left
		 
		 return count;
	 }
 
 
	public static void main(String[] args) {
		int [][] grid = {{1,1,0,0,0},{1,1,0,0,0},{0,0,0,1,1},{0,0,0,1,1}};
				
				/* {{0,0,0,0,0,0,0,0}};*/ /*
				{{0,0,1,0,0,0,0,1,0,0,0,0,0},
				{0,0,0,0,0,0,0,1,1,1,0,0,0},
				{0,1,1,0,1,0,0,0,0,0,0,0,0},
				{0,1,0,0,1,1,0,0,1,0,1,0,0},
				{0,1,0,0,1,1,0,0,1,1,1,0,0},
				{0,0,0,0,0,0,0,0,0,0,1,0,0},
		        {0,0,0,0,0,0,0,1,1,1,0,0,0},
		        {0,0,0,0,0,0,0,1,1,0,0,0,0}};*/
		
		int result = maxAreaOfIsland(grid);
		System.out.println(result);
	}

	}


