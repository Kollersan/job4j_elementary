package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int index = row; index < board.length; index++) {
            for (int i = 0; i < board[row].length; i++) {
                if (board[row][i] != 'X') {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
