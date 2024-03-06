package com.babel.calculadora.servicion;

public class Resultado {

    private String operacion;
    private Double operando1;
    private Double operando2;
    private Double resultado;

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public Double getOperando1() {
        return operando1;
    }

    public void setOperando1(Double operando1) {
        this.operando1 = operando1;
    }

    public Double getOperando2() {
        return operando2;
    }

    public void setOperando2(Double operando2) {
        this.operando2 = operando2;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    public Double getResultado() {
        return resultado;
    }
}
