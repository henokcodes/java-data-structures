package data.structures;


import java.util.HashMap;
import java.util.Map;

public class isSudokuValid {

    private static final int GRID_SIZE = 9;

   private static boolean isCharInBox(char[][] board, char number, int row, int col){
       int localBoxRow = row - row%3;
       int localBoxColumn = col - col % 3;
       for(int i = localBoxRow; i < localBoxColumn+3; i++){
           for (int k = localBoxColumn; k< localBoxColumn + 3;k++){
               if(board[i][k] == number)
                   return true;
           }
       }
       return  false;
   }

    private static boolean isCharInRow(char[][] board, char number, int row){
       for (int k = 0; k< GRID_SIZE ;k++){
           if(board[row][k] == number)
                    return true;
            }
        return  false;
    }
    private static boolean isCharInColumn(char[][] board, char number, int col){
        for (int k = 0; k< GRID_SIZE ;k++){
            if(board[k][col] == number)
                return true;
        }
        return  false;
    }

   private static boolean sudokuSolve(char[][] board) {
        // your code goes here

        for(int r=0;r<GRID_SIZE;r++){
            for(int c=0; c<GRID_SIZE; c++){
                if( isCharInRow(board, board[r][c],r) ||
                        isCharInColumn(board, board[r][c],c) ||
                        isCharInBox(board, board[r][c],r,c)
                             )  return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] test = {{'8','3','5','4','1','6','9','2','7'},
                {'2','9','6','8','5','7','4','3','1'},
                {'4','1','7','2','9','3','6','5','8'},
                {'5','6','9','1','3','4','7','8','2'},
                {'1','2','3','6','7','8','5','4','9'},
                {'7','4','8','5','2','9','1','6','3'},
                {'6','5','2','7','8','1','3','9','4'},
                {'9','8','1','3','4','5','2','7','6'},
                {'3','7','4','9','6','2','8','1','5'}};
        System.out.println(sudokuSolve(test));
    }
}
