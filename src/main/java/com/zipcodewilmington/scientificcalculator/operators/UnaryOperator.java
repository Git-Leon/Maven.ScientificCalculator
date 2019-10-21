package com.zipcodewilmington.scientificcalculator.operators;

import com.zipcodewilmington.scientificcalculator.utils.EnumUtilities;
import com.zipcodewilmington.scientificcalculator.operators.operations.*;

import java.util.List;
import java.util.function.Consumer;

public enum UnaryOperator {
    SQUARE((value) -> new Squared().display(value)),
    SQRT((value) -> new Sqrt().display(value)),
    FACTORIAL((value) -> new Factorial().display(value)),
    INVERSE((value) -> new Inverse().display(value)),
    SINE((value) -> new Sine().display(value)),
    COSINE((value) -> new Cosine().display(value)),
    TAN((value) -> new Tangent().display(value)),
    INVERSESINE((value) -> new InverseSine().display(value)),
    INVERSECOSINE((value) -> new InverseCosine().display(value)),
    INVERSETANGENT((value) -> new InverseTangent().display(value)),
    INVERSELOGARITHM((value) -> new InverseLogarithm().display(value)),
    INVERSENATURALLOGARITHM((value) -> new InverseNaturalLogarithm().display(value)),
    LOGARITHM((value) -> new Logarithm().display(value)),
    NATURALLOGARITHM((value) -> new NaturalLogarithm().display(value));


    private final Consumer<Double> operation;

    UnaryOperator(Consumer<Double> operation) {
        this.operation = operation;
    }

    public static void operate(String operatorName, Double value) {
        valueOf(operatorName.toUpperCase()).operation.accept(value);
    }
    
    public static List<String> names() {
        return EnumUtilities.getNamesOf(UnaryOperator.values());
    }

}
