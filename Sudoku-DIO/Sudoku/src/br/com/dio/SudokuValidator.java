package br.com.dio;

public class SudokuValidator {
    public static boolean isValid(SudokuBoard board, int row, int col, int num) {

        for (int j = 0; j < 9; j++) {
            if (board.get(row, j) == num) return false;
        }

        for (int i = 0; i < 9; i++) {
            if (board.get(i, col) == num) return false;
        }

        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board.get(startRow + i, startCol + j) == num) return false;
            }
        }
        return true;
    }
}
