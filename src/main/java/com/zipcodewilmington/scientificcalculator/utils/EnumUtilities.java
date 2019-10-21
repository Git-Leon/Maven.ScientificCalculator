package com.zipcodewilmington.scientificcalculator.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnumUtilities {
    public static List<String> getNamesOf(Enum[] enumerations) {
        List<Enum> values = Arrays.asList(enumerations);
        List<String> names = new ArrayList<>();
        values.forEach(operator -> names.add(operator.name()));
        return names;
    }
}
