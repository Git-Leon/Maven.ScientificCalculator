package com.zipcodewilmington.scientificcalculator.operations;

import com.zipcodewilmington.scientificcalculator.Console;

public class Division {
    public Division(){
    }

    public Double divide(double value1, double value2){
        if(value2 == 0){
            System.out.println("ERROR: Cannot divide by 0.");
            return null;
        } else {
            return value1 / value2;
        }
    }

    public void display(Double value1, Double value2) {
        Console.println(value1 + " / " + value2 + " = " + divide(value1, value2));
    }
}