package com.zipcodewilmington.scientificcalculator.operations;


import com.zipcodewilmington.scientificcalculator.Console;

public class Multiplication{

    public Multiplication(){
    }

    public Double multiply(double value1, double value2){
        return value1 * value2;
    }

    public void display(Double value1, Double value2) {
        Console.println(value1 + " * " + value1 + " = " + multiply(value1, value2));
    }
}


