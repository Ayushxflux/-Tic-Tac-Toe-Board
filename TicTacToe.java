package com.example.tictactoe;

public class SlotConverter {

    // Method to convert slot to row and column
    public static int[] convertSlot(int slot) {

        // Convert to zero-based index
        int index = slot - 1;

        int row = index / 3;
        int col = index % 3;

        return new int[]{row, col};
    }

    public static void main(String[] args) {

        int slot = 5; // Example input

        int[] position = convertSlot(slot);

        System.out.println("Slot: " + slot);
        System.out.println("Row: " + position[0]);
        System.out.println("Column: " + position[1]);
    }
}
