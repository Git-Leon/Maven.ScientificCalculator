package com.zipcodewilmington.scientificcalculator.operations;

import com.zipcodewilmington.scientificcalculator.Console;

public class Factorial {
    public Double factorial(Double value1){
        double facto = 1;
        for(int i = 1; i <= value1; i++){
                facto = facto * i;
            }
            return facto;
        }

    public void display(Double value) {
        Console.println("!" + value + " = " + factorial(value));
    }
}

