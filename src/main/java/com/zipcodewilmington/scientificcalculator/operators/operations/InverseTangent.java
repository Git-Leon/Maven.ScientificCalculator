package com.zipcodewilmington.scientificcalculator.operators.operations;

import com.zipcodewilmington.scientificcalculator.Console;

public class InverseTangent {
    public Double inverseTangent(double value){
        return Math.atan(value);
    }

    public void display(Double value) {
        Console.println("tan(" + value + ")^-1 = " + inverseTangent(value));
    }
}
