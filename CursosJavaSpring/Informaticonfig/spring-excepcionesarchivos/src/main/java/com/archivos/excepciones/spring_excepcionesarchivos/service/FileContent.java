package com.archivos.excepciones.spring_excepcionesarchivos.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service
public class FileContent {
    public String LecturaArchivo(String filepath){
        try{
            Path ruta = Paths.get(filepath);
            return Files.readString(ruta);
        } catch (IOException e) {
            throw new RuntimeException("Error en lectura de archivo: " + e.getMessage(), e);
        }
    }
}
