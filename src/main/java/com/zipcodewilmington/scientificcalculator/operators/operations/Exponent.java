package com.zipcodewilmington.scientificcalculator.operators.operations;

import com.zipcodewilmington.scientificcalculator.Console;

public class Exponent{

    public Exponent(){
    }

    public Double exponent(double value1, double value2){
        return  Math.pow(value1, value2);
    }

    public void display(Double value1, Double value2) {
        Console.println(value1 + " ^ " + value2 + " = " + exponent(value1, value2));
    }
}


