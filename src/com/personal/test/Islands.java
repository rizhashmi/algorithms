package com.personal.test;

public class Islands {

    public int numIslands(char[][] grid) {
    	int total =0;
    	for (int row =0; row <grid.length; row ++) {
    		for (int column=0; column < grid[0].length; column ++) {
    			if (grid[row][column] == 1) {
    				total +=1;
    				traverseAndMarkIsland(grid, row, column);
    				
    				}
    			}
    		}
    	return total;
    	
    }
    /**
     * DFS approach
     * @param grid
     * @param row
     * @param column
     * @return
     */
    public int traverseAndMarkIsland(char[][] grid, int row , int column) {
    	if (row < 0 
    			|| column <0  
    			|| row >= grid.length 
    			|| column >=grid[0].length
    			|| grid[row][column] != 1 
    			) {
    		return 0;
    	} else {
    		grid[row][column]='0';
    		return 1 + traverseAndMarkIsland(grid, row -1, column)
    		 + traverseAndMarkIsland(grid, row +1, column)
    		 + traverseAndMarkIsland(grid, row , column-1)
    		 + traverseAndMarkIsland(grid, row , column+1);	
    	}
    	
    	
    }
    public int findLargestIsland(char[][] grid) {
    	int biggestIsland =0;
    	for (int row =0; row <grid.length; row ++) {
    		for (int column=0; column < grid[0].length; column ++) {
    			if (grid[row][column] == 1) {
    				int temp = traverseAndMarkIsland(grid, row, column);
    				
    				if (temp > biggestIsland) {
    					biggestIsland = temp;
    				}
    			}
    		}
    	}
    	return biggestIsland;
    }
    
    public static void  main(String args[]) {
    	Islands islands = new Islands();

    	char mat[][] = {
    			{1, 1, 0, 0, 0},
                {0, 1, 0, 1, 1},
                {1, 0, 1, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1} 
                };
    	
    	//System.out.println(islands.traverseAndMarkIsland(mat, 0, 3));
    	
    	//System.out.println(islands.findLargestIsland(mat));

    	System.out.println(islands.numIslands(mat));

    }
	
}
