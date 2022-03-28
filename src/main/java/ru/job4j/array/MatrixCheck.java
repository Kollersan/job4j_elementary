package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int index = row; index < board.length; index++) {
           // for (int i = 0; i < board[row].length; i++) {
                if (board[row][index] != 'X') {
                    result = false;
                    break;
                //}
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int colum) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][colum] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X' && monoVertical(board, i) || monoHorizontal(board, i)) {
                    result = true;
                    break;
            }
        }
        return result;
    }
}
