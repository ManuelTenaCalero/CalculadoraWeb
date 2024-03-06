package com.babel.calculadora.controlador;

import com.babel.calculadora.servicion.Calculadora;
import com.babel.calculadora.servicion.Resultado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class ControladorCalculadora {

    @Autowired
    private Calculadora calculadora;
    @GetMapping("/{operacion}")
    public Resultado calculadora(@PathVariable("operacion") String operacion, @RequestParam("operando1") Double op1, @RequestParam("operando2") Double op2){

        return calculadora.calcular(operacion, op1, op2);

    }


}
