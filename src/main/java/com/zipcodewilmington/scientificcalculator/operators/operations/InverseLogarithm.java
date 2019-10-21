package com.zipcodewilmington.scientificcalculator.operators.operations;

import com.zipcodewilmington.scientificcalculator.Console;

public class InverseLogarithm {
    public InverseLogarithm() {
    }
    public Double inverseLogarithm(double value){
        if(value <= 0){
            Console.println("ERROR: Please enter a number larger than 0.");
            return null;
        } else {
            return Math.pow(10,value);
        }
    }

    public void display(Double value) {
        Console.println("10^" + value + " = " + inverseLogarithm(value));
    }
}
