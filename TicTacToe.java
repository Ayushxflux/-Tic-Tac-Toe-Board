package com.example.tictactoe;

import java.util.Random;

public class GameSetup {

    public static void main(String[] args) {

        // Player names
        String player1 = "Player 1";
        String player2 = "Player 2";

        // Game state variables
        String currentPlayer;
        char player1Symbol;
        char player2Symbol;

        // Random toss (0 or 1)
        Random random = new Random();
        int toss = random.nextInt(2);

        // Assign based on toss
        if (toss == 0) {
            currentPlayer = player1;
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = player2;
            player2Symbol = 'X';
            player1Symbol = 'O';
        }

        // Display results
        System.out.println("=== Game Setup ===");
        System.out.println("Toss Result: " + (toss == 0 ? player1 : player2) + " starts first");
        System.out.println(player1 + " Symbol: " + player1Symbol);
        System.out.println(player2 + " Symbol: " + player2Symbol);
        System.out.println("Current Player: " + currentPlayer);
    }
}
