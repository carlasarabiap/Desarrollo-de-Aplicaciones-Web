package ar.edu.centro8.desarrollo.proyectosb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    // endpoints
    @GetMapping("/")
    public String saludar() {
        return "Hola Mundo";
    }
    @GetMapping("saludar/{nombre}")
    public String saludar2(@PathVariable String nombre) {
        return "Hola "+nombre+" !!";
    }

    @GetMapping("saludar/{nombre}/{edad}")
    public String saludar3(@PathVariable String nombre, 
                            @PathVariable int edad) {
        return "Hola "+nombre+" !!";
    }
    @GetMapping("saludar/")
    public String saludar4(@RequestParam String nombre, 
                            @RequestParam int edad) {
        return "Hola "+nombre+" !!";
    }

}
