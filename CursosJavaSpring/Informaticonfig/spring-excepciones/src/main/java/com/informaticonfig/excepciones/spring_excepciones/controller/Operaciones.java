package com.informaticonfig.excepciones.spring_excepciones.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/division")
public class Operaciones {

    @GetMapping()
    public String Divide(@RequestParam(name = "numerador")String numeradorStr,
                         @RequestParam(name = "denominador")String denominadorStr){

        try{
            int numerador = Integer.parseInt(numeradorStr);
            int denominador = Integer.parseInt(denominadorStr);
            int resultado = numerador / denominador;

            return "Resultado: " + resultado;
        } catch (ArithmeticException e) {
            throw e;
        }catch (NumberFormatException e) {
            throw e;
        }

    }
}

@RestController
class Null_P_E{
    @GetMapping("valornulo")
    public String Nulo(){
        String valorNulo = null;
        valorNulo.length();

        return "Valor nulo en la variable";
    }


}
