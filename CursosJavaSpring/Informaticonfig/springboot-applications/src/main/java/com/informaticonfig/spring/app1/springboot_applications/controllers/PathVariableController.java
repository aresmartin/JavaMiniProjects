package com.informaticonfig.spring.app1.springboot_applications.controllers;

import com.informaticonfig.spring.app1.springboot_applications.models.Empleados;
import com.informaticonfig.spring.app1.springboot_applications.models.dto.ParametroDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/variable")

public class PathVariableController {
    @Value("${config.usuario}")
    private String usuario;

    @Value("${config.mensaje}")
    private String mensaje;

    @Value("${config.valores}")
    private String[] valores;

    @Value("${config.codigo}")
    private int codigo;

    @GetMapping("/pagina1/{mensaje}")
    public ParametroDTO pagina1(@PathVariable String mensaje){

        ParametroDTO parametro1 = new ParametroDTO();
        parametro1.setInformacion(mensaje);
        return parametro1;
    }

    @PostMapping("/solicitud")
    public Empleados creaEmple(@RequestBody Empleados empleado1){


        return empleado1;
    }

    @GetMapping("/valores")
    public Map<String, Object> values(){
        Map<String, Object> json = new HashMap<>();
        json.put("usuario:", usuario );
        json.put("codigo:", codigo );
        json.put("mensaje:", mensaje );
        json.put("valores:", valores );

        return json;
    }
}
