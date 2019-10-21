package com.zipcodewilmington.scientificcalculator.operators.operations;

import com.zipcodewilmington.scientificcalculator.Console;

public class InverseNaturalLogarithm {
    public InverseNaturalLogarithm(){
    }
    public Double inverseNaturalLogarithm(double value){
        return Math.exp(value);
    }

    public void display(Double value) {
        Console.println("e^" + value + " = " + inverseNaturalLogarithm(value));
    }
}
