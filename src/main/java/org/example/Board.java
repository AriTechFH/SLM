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
    public void print(){

    }
    }
