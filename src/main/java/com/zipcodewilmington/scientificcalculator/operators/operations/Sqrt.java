package com.zipcodewilmington.scientificcalculator.operators.operations;

import com.zipcodewilmington.scientificcalculator.Console;

public class Sqrt {
    public Double sqrt(double value) {
        if (value <= 0) {
            Console.println("ERROR: Please enter a positive number.");
            return null;
        } else {
            return Math.sqrt(value);
        }
    }

    public void display(Double value) {
        Console.println("√" + value + " = " + sqrt(value));
    }
}
