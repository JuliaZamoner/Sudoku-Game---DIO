package br.com.dio;

public class SudokuBoard {
    private final int[][] grid;

    public SudokuBoard(int[][] grid) {
        this.grid = grid;
    }

    public int get(int row, int col) {
        return grid[row][col];
    }

    public void set(int row, int col, int value) {
        grid[row][col] = value;
    }

    public boolean isEmpty(int row, int col) {
        return grid[row][col] == 0;
    }

    public void print() {
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) System.out.println("------+-------+------");
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j != 0) System.out.print("| ");
                System.out.print(grid[i][j] == 0 ? ". " : grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
