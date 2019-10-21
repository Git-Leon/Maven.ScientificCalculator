package com.zipcodewilmington.scientificcalculator.operators.operations;

import com.zipcodewilmington.scientificcalculator.Console;

public class NaturalLogarithm {
    public NaturalLogarithm(){
    }
    public Double naturalLogarithm(Double value){
        if(value <= 0){
            System.out.println("ERROR: Please enter a number larger than 0.");
            return null;
        } else {
            return (-Math.log((1-value)/value));
        }
    }

    public void display(Double value) {
        Console.println("ln(" + value + ") = " + naturalLogarithm(value));
    }
}