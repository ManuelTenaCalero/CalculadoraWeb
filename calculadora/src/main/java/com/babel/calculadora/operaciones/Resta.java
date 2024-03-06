package com.babel.calculadora.operaciones;

public class Resta implements Operation{

    public String id(){
        return "Resta";
    }
    @Override
    public String description(){
        return "Resta";
    }
    @Override
    public Double apply(Double a, Double b){
        return a-b;
    }
}
