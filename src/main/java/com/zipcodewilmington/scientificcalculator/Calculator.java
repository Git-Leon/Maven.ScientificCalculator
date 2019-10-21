package com.zipcodewilmington.scientificcalculator;

import com.zipcodewilmington.scientificcalculator.operations.*;

import java.util.Arrays;
import java.util.List;

class Calculator {
    private List<String> unaryOperators = Arrays.asList(
            "square",
            "sqrt",
            "factorial",
            "inverse",
            "invert",
            "sine",
            "cosine",
            "tangent",
            "inversesine",
            "inversecosine",
            "logarithm",
            "inverselogarithm",
            "naturallogarithm",
            "inversenaturallogarithm");

    private List<String> binaryOperators = Arrays.asList(
            "division",
            "subtraction",
            "multiplication",
            "addition",
            "exponent");

    private List<String> nullaryOperators = Arrays.asList(
            "options",
            "exit");

    void run() {
        String userInput = null;
        while(!"exit".equals(userInput)) {
            displayOptions();
            userInput = Console.getStringInput("\nSelect any of the above options.").toLowerCase();
            if (!binaryOperators.contains(userInput)) { // not binary operator
                if (!unaryOperators.contains(userInput)) { // not unary operator
                    if (!nullaryOperators.contains(userInput)) { // invalid operator
                        Console.println("Invalid user input!");
                        Console.println("Please try again!");
                        run();
                    } else { // run nullary operators
                        if("options".equals(userInput)) {
                            displayOptions();
                        } else {
                            break;
                        }
                    }
                } else { // run unary operators
                    Double value1 = Console.getDoubleInput("Enter first value: ");
                    runUnaryOperator(userInput, value1);
                }
            } else { // run binary operators
                Double value1 = Console.getDoubleInput("Enter first value: ");
                Double value2 = Console.getDoubleInput("Enter second value: ");
                runBinaryOperator(userInput, value1, value2);
            }
        }
    }

    private void runUnaryOperator(String operator, Double value) {
        switch (operator) {
            case "square":
                new Squared().display(value);
                break;
            case "sqrt":
                new Sqrt().display(value);
                break;
            case "factorial":
                new Factorial().display(value);
                break;
            case "inverse":
                new Inverse().display(value);
                break;
            case "invert":
                new Invert().display(value);
                break;
            case "sine":
                new Sine().display(value);
                break;
            case "cosine":
                new Cosine().display(value);
                break;
            case "tan":
                new Tangent().display(value);
                break;
            case "inversesine":
                new InverseSine().display(value);
                break;
            case "inversecosine":
                new InverseCosine().display(value);
                break;
            case "inversetangent":
                new InverseTangent().display(value);
                break;
            case "logarithm":
                new Logarithm().display(value);
                break;
            case "inverselogarithm":
                new InverseLogarithm().display(value);
                break;
            case "naturallogarithm":
                new NaturalLogarithm().display(value);
                break;
            case "inversenaturallogarithm":
                new InverseNaturalLogarithm().display(value);
                break;
        }
    }

    private void runBinaryOperator(String operator, Double value1, Double value2) {
        switch (operator) {
            case "add":
                new Addition().display(value1, value2);
                break;
            case "subtract":
                new Subtraction().display(value1, value2);
                break;
            case "multiply":
                new Multiplication().display(value1, value2);
                break;
            case "divide":
                new Division().display(value1, value2);
                break;
            case "exponent":
                new Exponent().display(value1, value2);
                break;
        }
    }

    private void displayOptions() {
        Console.println("\n-------------------------------------------------------------------");
        Console.println("Welcome to the operator-selector menu!");
        Console.println(unaryOperators.toString());
        Console.println(binaryOperators.toString());
        Console.println(nullaryOperators.toString());
    }
}