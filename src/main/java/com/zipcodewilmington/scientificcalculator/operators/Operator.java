package com.zipcodewilmington.scientificcalculator.operators;

import com.zipcodewilmington.scientificcalculator.Console;


public class Operator {
    public static void operate(String userInput) {
        if (BinaryOperator.names().contains(userInput)) { // binary operator
            BinaryOperator.operate(userInput,
                    Console.getDoubleInput("Input first value"),
                    Console.getDoubleInput("Input second value"));
        }

        if (UnaryOperator.names().contains(userInput)) { // unary operator
            UnaryOperator.operate(userInput,
                    Console.getDoubleInput("Input first value"));
        }
    }


}
