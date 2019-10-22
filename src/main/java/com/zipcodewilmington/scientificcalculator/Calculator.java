package com.zipcodewilmington.scientificcalculator;

import com.zipcodewilmington.scientificcalculator.operators.BinaryOperator;
import com.zipcodewilmington.scientificcalculator.operators.Operator;
import com.zipcodewilmington.scientificcalculator.operators.UnaryOperator;

class Calculator {
    void run() {
        String userInput = null;
        while(!"exit".equals(userInput)) {
            Console.println("\n-------------------------------------------------------------------");
            Console.println("Welcome to the operator-selector menu!");
            Console.println(UnaryOperator.names().toString());
            Console.println(BinaryOperator.names().toString());
            userInput = Console.getStringInput("\nSelect any of the above options.").toUpperCase();
            Operator.operate(userInput);
        }
    }
}