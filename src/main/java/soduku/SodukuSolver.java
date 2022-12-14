package soduku;

public class SodukuSolver {
	
	private static final int GRID_SIZE = 9;
	

	public static void main(String[] args) {
		
		int[][] board = {
				{7, 0, 2, 0, 5, 0, 6, 0, 0},
				{0, 0, 0, 0, 0, 3, 0, 0, 0},
				{1, 0, 0, 0, 0, 9, 5, 0, 0},
				{8, 0, 0, 0, 0, 0, 0, 9, 0},
				{0, 9, 0, 0, 0, 0, 0, 0, 8},
				{0, 0, 9, 7, 0, 0, 0, 0, 5},
				{0, 0, 0, 2, 0, 0, 0, 0, 0},
				{0, 0, 7, 0, 4, 0, 2, 0, 3}
		};
	}
	
	//check if number appears in row
	public static boolean isNumberInRow(int[][] board, int number, int row) {
		for (int i = 0; i < GRID_SIZE; i++) {
			if (number == board[row][i]) {
				return true;
			}
		}
		return false;
	}
	
	//check if number appears in row
	public static boolean isNumberInColumn(int[][] board, int number, int column) {
		for (int i = 0; i < GRID_SIZE; i++) {
			if (number == board[i][column]) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean isNumberInBox(int[][] board, int number, int row, int column) {
		int localBoxRow = row - row % 3;
		int localBoxColumn = column - column % 3;

		for (int i = localBoxRow; i < localBoxRow + 3; i++) {
			for (int j = localBoxColumn; j < localBoxColumn + 3; j++) {
				if (board[localBoxRow][localBoxColumn] == number) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean isValidPlacement(int[][] board, int number, int row, int column) {
		If (!isNumberInRow(board, number, row, column) &&
			isNnumberInColumn(board, number, row, column) &&
			isNumberInBox(board, number, row, column)) {
		Return true;
		}
		Return false;
	}

	Private static boolean solveBoard(int[][] board) {
		


}
