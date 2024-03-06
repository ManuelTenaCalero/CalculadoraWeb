package com.babel.calculadora.servicion;

import com.babel.calculadora.operaciones.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class Calculadora {


    private Map<String,Operation> operaciones = new HashMap<>();


    public Calculadora(List<Operation> operaciones){

        for (Operation operation : operaciones) {
            this.operaciones.put(operation.id(), operation);
        }
    }



    public Resultado calcular(String operacion, Double operando1, Double operando2){

        Operation operacionSeleccionada = operaciones.get(operacion);
        Resultado result = new Resultado();
        result.setResultado(operacionSeleccionada.apply(operando1,operando2));
        result.setOperacion(operacion);
        result.setOperando1(operando1);
        result.setOperando2(operando2);
        return result;
    }
}
