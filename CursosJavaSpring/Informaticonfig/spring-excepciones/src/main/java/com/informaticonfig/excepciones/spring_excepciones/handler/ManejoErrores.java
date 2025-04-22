package com.informaticonfig.excepciones.spring_excepciones.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ManejoErrores {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<String> handlerArithmeticException(ArithmeticException e){
        return new ResponseEntity<>("Error: División por cero no permitida", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<String> handlerNumberFormatException(NumberFormatException e){
        return new ResponseEntity<>("Error: Valor ingresado no numérico", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> handlerNullPointerException(NullPointerException e){
        return new ResponseEntity<>("Error: Valor de variable es nulo", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
