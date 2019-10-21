package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        new MainApplication().run();
    }

    public void run() {
        String userInput = null;

        main_loop:
        while (!"exit".equals(userInput)) {
            displayOptions();
            userInput = Console.getStringInput("[calculator], [trig], [exit]");
            switch (userInput) {
                case "calculator":
                    new Calculator().run();
                    break;

                case "trig":
                    new DegreesToRadians().run();
                    break;

                case "exit":
                    break main_loop;

                default:
                    break;
            }
        }
    }

    private void displayOptions() {
        Console.println("\n-------------------------------------------------------------------");
        Console.println("Welcome to the Calculator Application!");
        Console.println("From here, you can enter any of the following commands:");
    }
}