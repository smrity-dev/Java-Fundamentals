package games;


import java.util.Scanner;
public class TicTacToeGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declare Board
        char[][] board = new char[3][3];
        // Fill (Inputs) Board with '_'
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                board[i][j] = '_';
            }
        }
        char currentPlayer = 'X';
        while(true) {
            // Print Board
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            // User's Inputs
            System.out.println("\nPlayer " + currentPlayer);            //Current Player is X now
            System.out.print("Enter Row (0-2): ");
            int row = sc.nextInt();
            System.out.print("Enter Col (0-2): ");
            int col = sc.nextInt();
            // Validation for Invalid Index
            if(row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Invalid Position!");
                continue;
            }
            // Already Filled
            if(board[row][col] != '_') {
                System.out.println("Position Already Filled!");
                continue;
            }
            // Place Your Move
            board[row][col] = currentPlayer;
            // Winning Conditions
            boolean winner = false;
            // Check Rows conditions ( Horizontally )
            for(int i = 0; i < 3; i++) {
                if(board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                    winner = true;
                }
            }
            // Check Columns conditions ( Vertically )
            for(int j = 0; j < 3; j++) {
                if(board[0][j] == currentPlayer && board[1][j] == currentPlayer && board[2][j] == currentPlayer) {
                    winner = true;
                }
            }
            // Checks Main Diagonal
            if(board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
                winner = true;
            }
            // Checks Reverse Diagonal
            if(board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
                winner = true;
            }

            // Winner Printing
            if(winner) {
                System.out.println("\nFinal Board:");
                for(int i = 0; i < 3; i++) {
                    for(int j = 0; j < 3; j++) {
                        System.out.print(board[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("\n🎉 Player " + currentPlayer + " Wins!");
                break;
            }

            // WithDraw conditions Check
            boolean draw = true;
            // Draw false When --->>>
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    if(board[i][j] == '_') {
                        draw = false;
                    }
                }
            }
            //Draw true When --->>>
            if(draw) {
                System.out.println("\nFinal Board:");
                for(int i = 0; i < 3; i++) {
                    for(int j = 0; j < 3; j++) {
                        System.out.print(board[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("\nGame Draw!");
                break;
            }
            // Change Player from 'X' to 'O'
            if(currentPlayer == 'X') {
                currentPlayer = 'O';
            }
            else {
                currentPlayer = 'X';
            }
        }
        sc.close();
    }
}