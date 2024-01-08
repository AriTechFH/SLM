package org.example;

public class Board {

    private char[][] cells;

    public Board() {
        cells = new char[3][3];
    }

    public void place(int x, int y, char marker) {
        cells[x][y] = marker;
    }

    public boolean isCellEmpty(int x, int y) {
        return cells[x][y] == '\u0000'; // Check if cell is empty
    }
    public void print() {
        System.out.println("▁▁▁▁▁▁");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                char cellValue = (cells[i][j] == '\u0000') ? ' ' : cells[i][j];
                System.out.print(cellValue + "|");
            }
            System.out.println();
        }
        System.out.println("▔▔▔▔");
    }
}