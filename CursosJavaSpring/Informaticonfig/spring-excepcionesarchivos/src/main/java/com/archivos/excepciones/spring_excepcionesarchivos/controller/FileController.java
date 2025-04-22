package com.archivos.excepciones.spring_excepcionesarchivos.controller;

import com.archivos.excepciones.spring_excepcionesarchivos.service.FileContent;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/archivo")
public class FileController {

    private final FileContent contenido;

    public FileController(FileContent contenido){
        this.contenido = contenido;
    }

    @GetMapping("/lectura")
    public ResponseEntity<String> lectura(@RequestParam String filepath){
        try{
            String elArchivo = contenido.LecturaArchivo(filepath);
            return ResponseEntity.ok(elArchivo);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error de lectura del archivo" + e);
        }
    }
}
