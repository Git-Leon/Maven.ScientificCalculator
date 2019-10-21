package com.zipcodewilmington.scientificcalculator.operators.operations;

import com.zipcodewilmington.scientificcalculator.Console;

public class Addition{

    public Addition(){
    }

    public double add(double value1 , double value2 ){
        return value1 + value2;
    }

    public void display(double value1, double value2) {
        Console.println(value1+ " + " + value2 + " = " + add(value1, value2));
    }
}


