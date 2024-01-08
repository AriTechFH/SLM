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
    public boolean hasWinner() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (checkRow(i)) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (checkColumn(i)) {
                return true;
            }
        }

        // Check diagonals
        if (checkDiagonal(0, 0, 1, 1) || checkDiagonal(0, 2, 1, -1)) {
            return true;
        }

        return false;
    }

    private boolean checkRow(int row) {
        return (cells[row][0] == cells[row][1] && cells[row][1] == cells[row][2] && cells[row][0] != '\u0000');
    }

    private boolean checkColumn(int col) {
        return (cells[0][col] == cells[1][col] && cells[1][col] == cells[2][col] && cells[0][col] != '\u0000');
    }

    private boolean checkDiagonal(int startX, int startY, int deltaX, int deltaY) {
        char startCell = cells[startX][startY];
        return (startCell == cells[startX + deltaX][startY + deltaY] &&
                startCell == cells[startX + 2 * deltaX][startY + 2 * deltaY] &&
                startCell != '\u0000');
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