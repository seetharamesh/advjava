package advjava;
import java.util.*;
import java.util.stream.IntStream;

//https://leetcode.com/problems/rotting-oranges/

//The description is not clear.... actually the problem should be solved taking all rotten organges in a queue and 
//process that queue to see if any fresh organges are in any of its 4 directions. If so, convert them to rotten. The total time
//taken will be ONLY ONE MINUTE for all fresh oranges in one shot turn down to rotten.

//Secondly look at the after conversion grid to convert any remaining fresh to rotten

//thirdly if anything is left unconverted it means there's no way it can be converted. so return -1


public class RottenOrangesBFS {
	
	

	 public static int orangesRotting(int[][] grid) {
		 
		 int  rowlen = grid.length;
		 int collen = grid[0].length;
		 int mins = 0;
		 boolean flag = false;
		 boolean visited[][] = new boolean[rowlen][collen];
		 
		 Queue<String>rottenQueue = new LinkedList<>();
		 
		 //STEP 1: ADD ALL ROTTEN ORANGES INDICES IN A QUEUE
		 //1. add the index to queue
		 for(int i=0; i < rowlen; i++) {
			 for(int j = 0; j < collen; j++) {
				 if(grid[i][j] == 2)
					 rottenQueue.add(i + "," + j);		 
			 }
		 }
		
		 while(true) {
			 Queue<String>queue = new LinkedList<>();
		//STEP 2: empty the rotten oranges queue. Add it's neighbors into another queue.
		 while(!rottenQueue.isEmpty()) {
			  String element = rottenQueue.remove();
			
				 int i = Integer.parseInt(element.split(",")[0]); 
				 int j = Integer.parseInt(element.split(",")[1]);

				 flag = isValid(grid,i,j+1, visited);//right
					 if(flag && grid[i][j+1] == 1 ) {
						 grid[i][j+1] = 2;
						  queue.add(i+","+(j+1));
					 }
					 
					  flag = isValid(grid, i+1, j, visited); //down
					  if(flag && grid[i+1][j] == 1 ) {
						  grid[i+1][j] = 2;
						  queue.add(i+1 + "," + j);
					  }
					  
					  flag = isValid(grid,i, j-1,visited);//left
					  if(flag && grid[i][j-1] == 1 ) {
						  grid[i][j-1] = 2;
						  queue.add(i + "," + (j-1));						
					  }
					  
					  flag = isValid(grid,i-1,j,visited);//up
					  if(flag && grid[i-1][j]==1 ) {
						  grid[i-1][j] = 2;
						  queue.add(i-1 + "," + j);
					  }
					 
		 }//end of while rotten oranges
		 
		
		//STEP 3: when the second queue is empty it means we have processed all rotten oranges in the grid
		 if(queue.isEmpty()) {
			 
			 for(int i = 0; i < grid.length; i++) {
		            for(int j = 0; j < grid[i].length; j++) {
		                if(grid[i][j] == 1) {
		                    return -1;
		                }
		            }
		        }
			  
			 return mins;
		 }
		 else {
			 //STEP 4: if we are here it means there are rotten oranges remaining in the grid.
			 rottenQueue = queue;
			 ++mins;
		 }
		 }//end of while true
	 }
	 
	 
	 public static boolean isValid(int[][] grid, int row, int col, boolean[][] visited) {
		 
		 if (row >= 0 && row < grid.length &&
			        col >= 0 && col < grid[0].length && !visited[row][col]) {
			 		
			 		visited[row][col] = true;			 		
			        return true;
		 }			         
			    return false;		 
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = //{{2,1,1},{1,1,1},{0,1,2}};//output 2
		
		//{{2,0,1,1,1,1,1,1,1,1},{1,0,1,0,0,0,0,0,0,1},{1,0,1,0,1,1,1,1,0,1},{1,0,1,0,1,0,0,1,0,1},{1,0,1,0,1,0,0,1,0,1},{1,0,1,0,1,1,0,1,0,1},{1,0,1,0,0,0,0,1,0,1},{1,0,1,1,1,1,1,1,0,1},{1,0,0,0,0,0,0,0,0,1},{1,1,1,1,1,1,1,1,1,1}};
			
			
		//	{{2,1}};//output 1
			
			//{{1,2}}; //output 1
		//{{0,2}};//output 0
			//{{2,1,1},{0,1,1},{1,0,1}};//output -1
			//{{0},{2}};
			//{{1},{2}};
		//{{2,1,1},{1,1,0},{0,1,1}}; //output 4
	{{0}};//output 0
		//{{1}};//output -1
	int result = orangesRotting(grid);
	System.out.println(result);

	}

}
