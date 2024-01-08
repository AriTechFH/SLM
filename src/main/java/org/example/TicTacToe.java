package org.example;

import java.util.Scanner;

public class TicTacToe {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;

    public TicTacToe() {
        player1 = new Player('O');
        player2 = new Player('X');
        currentPlayer = player1;
        board = new Board();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean gameWon = false;

        while (!gameWon) {
            board.print();
            System.out.println("Current Player: " + currentPlayer.getMarker());

            System.out.print("Row (0-2): ");
            int row = scanner.nextInt();
            System.out.print("Column (0-2): ");
            int column = scanner.nextInt();

            if (board.isCellEmpty(row, column)) {
                board.place(row, column, currentPlayer.getMarker());
            } else {
                System.out.println("Cell already occupied. Try again.");
            }
        }

        board.print();

        if (!board.hasWinner()) {
            System.out.println("It's a tie!");
        } else {
            System.out.println("Player " + currentPlayer.getMarker() + " wins!");
        }
    }

    private Player switchCurrentPlayer() {
        return (currentPlayer == player1) ? player2 : player1;
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.start();
    }
}

