package advjava;

import java.util.LinkedList;
import java.util.Queue;

public class MaxAreaOfIsland {
	
	 public int maxAreaOfIsland(int[][] grid) {
	        int result = 0;
	      //STEP 1: ADD ALL 1 INDICES IN A QUEUE
	        int rowlen = grid.length;
	        int collen = grid[0].length;
			 Queue<String>queue = new LinkedList<>();
			 boolean flag = false;
			 int prevCount = 0, count = 1, maxarea = 0;
			 
			 for(int i=0; i < rowlen; i++) {
				 for(int j = 0; j < collen; j++) {
					 if(grid[i][j] == 1)
						 queue.add(i + "," + j);		 
				 }
			 }
			 while(!queue.isEmpty()) {
				 while(true) {
				 String element = queue.remove();
					
				 int i = Integer.parseInt(element.split(",")[0]); 
				 int j = Integer.parseInt(element.split(",")[1]);
				 
				 	flag = isValid(grid,i,j+1);//right
					 if(flag && grid[i][j+1] == 1 ) {
						count++;
					 }
					 
					  flag = isValid(grid, i+1, j); //down
					  if(flag && grid[i+1][j] == 1 ) {
						  count++;
					  }
					  
					  flag = isValid(grid,i, j-1);//left
					  if(flag && grid[i][j-1] == 1 ) {
						  count++;	
					  }
					  
					  flag = isValid(grid,i-1,j);//up
					  if(flag && grid[i-1][j]==1 ) {
						  count++;
					  }
					  
					  if(count == 1) break; //means there's water around it
					  prevCount += count;
					  
				 }//end of while true
				  maxarea = Math.max(prevCount, count);
				  count = 0;
		 }//end of while  
		
			 
			 
			 
			 
			 
			 
			 
	        return result;
	        
	    }
	 
	 
 public static boolean isValid(int[][] grid, int row, int col) {
		 
		 if (row >= 0 && row < grid.length &&
			        col >= 0 && col < grid[0].length) {		 		
			        return true;
		 }			         
			    return false;		 
	 }
 
	public static void main(String[] args) {
		int [][] grid = 
				{{0,0,1,0,0,0,0,1,0,0,0,0,0},
				{0,0,0,0,0,0,0,1,1,1,0,0,0},
				{0,1,1,0,1,0,0,0,0,0,0,0,0},
				{0,1,0,0,1,1,0,0,1,0,1,0,0},
				{0,1,0,0,1,1,0,0,1,1,1,0,0},
				{0,0,0,0,0,0,0,0,0,0,1,0,0},
		        {0,0,0,0,0,0,0,1,1,1,0,0,0},
		        {0,0,0,0,0,0,0,1,1,0,0,0,0}};
		}

	}


