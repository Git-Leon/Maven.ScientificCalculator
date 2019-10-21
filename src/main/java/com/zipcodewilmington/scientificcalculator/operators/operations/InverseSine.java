package com.zipcodewilmington.scientificcalculator.operators.operations;

import com.zipcodewilmington.scientificcalculator.Console;

public class InverseSine {
    public Double inverseSine(double value){
        if(value <= 1 && value >= -1){
            return Math.asin(value);
        } else {
            Console.println("ERROR: Please enter a number between -1 and 1.");
            return inverseSine(value);
        }
    }

    public void display(Double value) {
        Console.println("sin(" + value + ")^-1 = " + inverseSine(value));
    }
}
