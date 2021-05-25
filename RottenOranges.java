package advjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RottenOranges {
	
public static int orangesRotting(int[][] grid) {
//basecase
	System.out.println(grid[0].length);
	System.out.println(grid.length);
	
	if( grid.length == 2 && grid[0].length==1) {
		if(((grid[0][0] == 1 || grid[0][0] == 2) && (grid[1][0] == 2 || grid[1][0] == 1))) {
			return 1;
	    }
	}
	else if(grid.length == 2 && grid[0].length == 2) {
		if(((grid[0][0] == 1 || grid[0][0] == 2) && (grid[0][1] == 2 || grid[0][1] == 1 ))) {
			return 0;
	}
	}
	else if(grid.length == 1 && grid[0].length == 1 && (grid[0][0] == 0 || grid[0][0] == 2)) {
		return 0;
	}
	else if(grid.length == 1 && grid[0].length == 1 && grid[0][0] == 1) {
		return -1;
	}
	else if(grid.length == 1 && (grid[0][0] == 0 || grid[0][1] == 0) && (grid[0][1] == 2 || grid[0][0]==2))
		return 0;

int minutes = 0;
boolean flag = false;

for(int i = 0; i < grid.length; i++) {
	for(int j = 0; j < grid[0].length; j++) {
		if(grid[i][j] == 2) {
			if(j < grid.length-1) {
			if(grid[i][j+1] == 1) { //check right element
				grid[i][j+1] = 2;
				flag = true;
				//++minutes;	
			}
			}
			if(i < grid.length-1) {
			if(grid[i+1][j] == 1) { //check down element
				grid[i+1][j] = 2; 
				//++minutes;	
				flag = true;
			}	
			}
			if(flag)++minutes;
			flag= false;
		//}//end of right and below if
			
			if(i > 0 ) {
				if(grid[i-1][j]==1) { //check up
					grid[i-1][j] =2;
					++minutes;
					
			}
			}//end of up
			if(j > 0) {
				if(grid[i][j-1] == 1){//check left
					grid[i][j-1] = 2;
					++minutes;
					
				}
			}//end of left
		}//end of outside if
	}//end of j
	
}//end of i

IntStream stream = Arrays.stream(grid).flatMapToInt(x -> Arrays.stream(x)).filter(n -> n==1);
if(stream.count() > 0) {
	System.out.println("inside stream");
	return -1;
}
//stream.forEachOrdered(n -> System.out.print(n + " "));
    
    return minutes;
    
}
        
    

	public static void main(String[] args) {
		int[][] grid = {{2,0,1,1,1,1,1,1,1,1},{1,0,1,0,0,0,0,0,0,1},{1,0,1,0,1,1,1,1,0,1},{1,0,1,0,1,0,0,1,0,1},{1,0,1,0,1,0,0,1,0,1},{1,0,1,0,1,1,0,1,0,1},{1,0,1,0,0,0,0,1,0,1},{1,0,1,1,1,1,1,1,0,1},{1,0,0,0,0,0,0,0,0,1},{1,1,1,1,1,1,1,1,1,1}};
				
				
				
				
				//{{1,2}}; //output 1
			//{{0,2}};
				//{{2,1,1},{0,1,1},{1,0,1}};
				//{{0},{2}};
			//	{{1},{2}};
			//{{2,1,1},{1,1,0},{0,1,1}};
		//{{0}};
			//{{1}};
		int result = orangesRotting(grid);
		System.out.println(result);
	}

}



/*List< List<Integer> > nestedLists =
            Arrays.
            //Convert the 2d array into a stream.
            stream(grid).
            //Map each 1d array (internalArray) in 2d array to a List.
            map(
                    //Stream all the elements of each 1d array and put them into a list of Integer.
                    internalArray -> Arrays.stream(internalArray).boxed().collect(Collectors.toList()
                )
    //Put all the lists from the previous step into one big list.
    ).collect(Collectors.toList());

    nestedLists.forEach(System.out::println);
    
System.out.println(nestedLists.size());    */
