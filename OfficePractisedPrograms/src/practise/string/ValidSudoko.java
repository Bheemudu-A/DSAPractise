package practise.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidSudoko {
	public static boolean isValidSudoku(char[][] board) {

		Set<String> set = new HashSet<>();

		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				char ch = board[i][j];
				if(ch != '.') {	
					String row = "row"+i+ch;
					String col = "col"+j+ch;
					String columnGrid = "grid"+(i/3)+(j/3)+ch;

					if(!set.add(row) || !set.add(col) || !set.add(columnGrid)) { //if any of the seen already then returns false
						return false;
					}
				}
			} // for invalid sudoko row05, col05, row05
		}
		return true;	
	}
    
    
    
    //If condition is shortcut for this
    /*
     * if (seen.contains(rowKey) || seen.contains(colKey) || seen.contains(subGridKey)) {
    		return false;
		}
		seen.add(rowKey);
		seen.add(colKey);
		seen.add(subGridKey);
     */

    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        if (isValidSudoku(board)) {
            System.out.println("The Sudoku board is valid.");
        } else {
            System.out.println("The Sudoku board is invalid.");
        }
    }
}

