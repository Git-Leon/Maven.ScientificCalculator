package com.zipcodewilmington.scientificcalculator.operators.operations;

import com.zipcodewilmington.scientificcalculator.Console;

public class Logarithm {
    public Double logarithm(double value){
        if(value <= 0){
            System.out.println("ERROR: Please enter a number larger than 0.");
            return null;
        } else {
            return Math.log(value);
        }
    }

    public void display(Double value) {
        Console.println("Log(" + value + ") = " + logarithm(value));
    }
}
