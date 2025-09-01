package br.com.dio;

public class Main {
    public static void main(String[] args) {
        int[][] grid = {
                {5,3,0, 0,7,0, 0,0,0},
                {6,0,0, 1,9,5, 0,0,0},
                {0,9,8, 0,0,0, 0,6,0},

                {8,0,0, 0,6,0, 0,0,3},
                {4,0,0, 8,0,3, 0,0,1},
                {7,0,0, 0,2,0, 0,0,6},

                {0,6,0, 0,0,0, 2,8,0},
                {0,0,0, 4,1,9, 0,0,5},
                {0,0,0, 0,8,0, 0,7,9}
        };

        SudokuBoard board = new SudokuBoard(grid);
        System.out.println("Tabuleiro inicial:");
        board.print();

        if (SudokuSolver.solve(board)) {
            System.out.println("\nSolução encontrada:");
            board.print();
        } else {
            System.out.println("Não foi possível resolver este Sudoku.");
        }
    }
}