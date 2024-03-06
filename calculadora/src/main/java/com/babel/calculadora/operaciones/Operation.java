package com.babel.calculadora.operaciones;

import java.util.function.BinaryOperator;

public interface Operation  extends BinaryOperator<Double> {
    String id();
    String description();

}
