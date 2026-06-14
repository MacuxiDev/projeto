package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping({"", "/"})
    public String home() {
        // Altere o texto destas tags h1 e h2 para criar as Versões 1.0, 2.0 e 3.0
        return "<div style='text-align:center; margin-top:50px; font-family:sans-serif;'>"
             + "<h1>Ambiente de Staging (Spring Boot + Java 21)</h1>"
             + "<h2 style='color:#27ae60;'>Versão 1.0 - Primeiro Deploy com Sucesso!</h2>"
             + "</div>";
    }
}