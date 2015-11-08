package edu.cpp.cs.cs141.classproject;

public class Map {

	public static final int GRID_SIZE = 9;

	private Object[][] grid = new Object[GRID_SIZE][GRID_SIZE];

	/*
	 * Show the map to the Player
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String result = "";
		for (int i = 0; i < GRID_SIZE; i++){
			for (int j = 0; j < GRID_SIZE; j++){
				if (grid[i][j] == null)
					result += " [X]";
				else
					result += " [" + grid[i][j].toString() + "]";
			}
			result += "\n";
		}
		return result;
	}

	public void addObject(int row, int col, Object o) {
		grid[row][col] = o;
	}
	
	public Object getObject (int row, int col) {
		return grid[row][col];
	}
	
	public Object removeObject(int row, int col){
		Object o = grid[row][col];
		grid[row][col] = null;
		return o;
	}
	
	public boolean moveObject(int row, int col, int newRow, int newCol){
		if (grid[row][col] != null && grid[newRow][newCol] == null){
			grid[newRow][newCol] = removeObject(row, col);
			return true;
		}
		return false;
	}
	
}
