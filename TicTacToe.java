
package com.example.tictactoe;

import java.util.Scanner;

public class UserInput {

    // Method to read and return slot number
    public static int getSlotInput() {
        Scanner scanner = new Scanner(System.in);
        int slot;

        while (true) {
            System.out.print("Enter a slot number (1-9): ");

            // Check if input is integer
            if (scanner.hasNextInt()) {
                slot = scanner.nextInt();

                // Validate range
                if (slot >= 1 && slot <= 9) {
                    return slot; // valid input
                } else {
                    System.out.println("Invalid input! Enter number between 1 and 9.");
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next(); // clear invalid input
            }
        }
    }

    public static void main(String[] args) {
        // Call method
        int chosenSlot = getSlotInput();

        // Return control to game logic (for now just display)
        System.out.println("Selected Slot: " + chosenSlot);
    }
}
