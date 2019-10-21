package com.zipcodewilmington.scientificcalculator.operations;

import com.zipcodewilmington.scientificcalculator.Console;

public class Inverse {
    public Double inverse(Double value){
        if(value == 0){
            System.out.println("ERROR: Cannot have an inverse of 0.");
            return null;
        } else {
            return 1/value;
        }
    }

    public void display(Double value) {
        Console.println("1/" + value + " = " + inverse(value));
    }
}
