package com.zipcodewilmington.scientificcalculator.operators;

import com.zipcodewilmington.scientificcalculator.operators.operations.*;
import com.zipcodewilmington.scientificcalculator.utils.EnumUtilities;

import java.util.List;
import java.util.function.BiConsumer;

public enum BinaryOperator {
    ADD((value1, value2) -> new Addition().display(value1, value2)),
    SUBTRACT((value1, value2) -> new Subtraction().display(value1, value2)),
    MULTIPLICATION((value1, value2) -> new Multiplication().display(value1, value2)),
    DIVIDE((value1, value2) -> new Division().display(value1, value2)),
    EXPONENT((value1, value2) -> new Exponent().display(value1, value2));

    private final BiConsumer<Double, Double> operation;

    BinaryOperator(BiConsumer<Double, Double> operation) {
        this.operation = operation;
    }

    public static void operate(String operatorName, Double value1, Double value2) {
        valueOf(operatorName.toUpperCase()).operation.accept(value1, value2);
    }

    public static List<String> names() {
        return EnumUtilities.getNamesOf(BinaryOperator.values());
    }
}
