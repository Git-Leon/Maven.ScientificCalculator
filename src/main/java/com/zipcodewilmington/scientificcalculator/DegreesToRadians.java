package com.zipcodewilmington.scientificcalculator;

public class DegreesToRadians {
    public void run() {
        String userInput = null;
        while (!"exit".equals(userInput)) {
            displayOptions();
            userInput = Console.getStringInput("[degrees], [radians]").toLowerCase();
            if("degrees".equals(userInput)) {
                // TODO
            } else if("radians".equals(userInput)) {
                // TODO
            }
        }
    }

    private void displayOptions() {
        Console.println("\n-------------------------------------------------------------------");
        Console.println("From here, you can enter any of the following commands:");
    }

}