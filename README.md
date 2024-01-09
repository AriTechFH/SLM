# Tic-Tac-Toe Game

## Overview

This repository contains a simple console-based implementation of the classic Tic-Tac-Toe game in Java. The game allows two players to take turns making moves on a 3x3 grid, aiming to get three of their marks in a row (horizontally, vertically, or diagonally) to win the game.

## Features

- Player input for each move (row and column).
- Visual representation of the game board.
- Basic win and tie conditions.
- Option to restart the game after completion.

## Project Structure

The project consists of three main classes:

- `TicTacToe`: The main class to initiate and manage the game.
- `Board`: Represents the game board and includes methods for making moves and checking for a winner.
- `Player`: Represents a player with a marker ('X' or 'O').

## Getting Started

1. **Clone the repository:**

   ```bash
   git clone  https://github.com/AriTechFH/SLM

# Compile and Run:

To compile and run this project locally, follow these steps:

2. **Clone the repository:**

    ```bash
    git clone https://github.com/AriTechFH/SLM.git
    ```

3. **Navigate to the project directory:**

    ```bash
    cd SLM
    ```

4. **Compile the project:**

    ```bash
    mvn compile
    ```

5. **Run the project:**

    ```bash
    mvn exec:java -Dexec.mainClass="Main"
    ```

Make sure you have [Maven](https://maven.apache.org/) installed on your system to compile and run the project.


# Gameplay:

Players take turns entering the row and column numbers to make their moves. The game board is displayed bevor and after each move. The game ends when a player wins or the board is full (tie). After the game ends, you can choose to play again.

# Restarting the Game:

After the game ends, you'll be prompted to play again.

# Requirements:

- Java 17

# License:

This project is licensed under the MIT License.


# Testing:

You can find the test classes for this project in the [test directory](https://github.com/AriTechFH/SLM/tree/main/src/test/java). To run the tests locally, follow these steps:

1. **Clone the repository:**

    ```bash
    git clone https://github.com/AriTechFH/SLM.git
    ```

2. **Navigate to the project directory:**

    ```bash
    cd SLM
    ```

3. **Compile the project:**

    ```bash
    mvn compile
    ```

4. **Run the tests:**

    ```bash
    mvn test
    ```

Make sure you have [Maven](https://maven.apache.org/) installed on your system to run the tests.

Now have fun with TicTacToe! 
