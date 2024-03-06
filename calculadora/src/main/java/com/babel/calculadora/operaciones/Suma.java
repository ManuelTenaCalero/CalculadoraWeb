package com.babel.calculadora.operaciones;

import org.springframework.stereotype.Component;

@Component("Suma")
public class Suma implements Operation{

    public String id(){
        return "Suma";
    }
@Override
public String description(){
    return "Suma";
}
@Override
public Double apply(Double a, Double b){
    return a+b;
}
}
