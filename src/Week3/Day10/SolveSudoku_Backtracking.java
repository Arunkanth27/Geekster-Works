package Week3.Day10;

//import java.util.*;

public class SolveSudoku_Backtracking {
    public static void main(String[] args) {

        int[][] board = { {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0} };

        System.out.println(solve(board));
    }

    public static boolean solve(int[][] board) {
        int row = -1;
        int column = -1;
        boolean flag = true;
        outer:
        for(int i = 0 ; i < board.length ; i++) {
            for(int j = 0 ; j < board[i].length ; j++) {
                if(board[i][j] == 0) {
                    row = i;
                    column = j;
                    flag = false;
                    break outer;
                }
            }
        }

        if(flag) {
            for (int[] r : board) {
                for (int i : r) {
                    System.out.print(i + "\t");
                }
                System.out.println();
            }
            return true;
        }

        for(int k = 1 ; k <= 9 ; k++) {
            if(helper(k, row, column, board)) {
                board[row][column] = k;
                if(solve(board)) {
                    return true;
                } else {
                    board[row][column] = 0;
                }
            }
        }

        return false;
    }

    private static boolean helper(int k, int row, int column, int[][] board) {
        for(int i = 0 ; i <= row ; i++) {
            if(board[i][column] == k) {
                return false;
            }
        }

        for(int i = 0 ; i <= column ; i++) {
            if(board[row][i] == k) {
                return false;
            }
        }

        int sqrt = (int) Math.sqrt(board.length);
        int boxRowStart = row - row % sqrt;
        int boxColumnStart = column - column % sqrt;

        for(int i = boxRowStart ; i < boxRowStart + sqrt ; i++) {
            for(int j = boxColumnStart ; j < boxColumnStart + sqrt ; j++) {
                if(board[i][j] == k) {
                    return false;
                }
            }
        }

        return true;
    }
}
