package com.zipcodewilmington.scientificcalculator;

public class DegreesToRadians {
    public void run() {
        String userInput = null;
        while (!"exit".equals(userInput)) {
            displayOptions();
            userInput = Console.getStringInput("[degrees], [radians]").toLowerCase();
            if("degrees".equals(userInput)) {

            } else if("radians".equals(userInput)) {

            }
        }
    }

    private void displayOptions() {
        Console.println("\n-------------------------------------------------------------------");
        Console.println("Welcome to the Calculator Application!");
        Console.println("From here, you can enter any of the following commands:");
    }

}