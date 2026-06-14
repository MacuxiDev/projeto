package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    // O "/**" garante que o Spring Boot vai capturar a requisição na raiz da subpasta do Tomcat
    @GetMapping("/**")
    public String home() {
        return "<div style='text-align:center; margin-top:50px; font-family:sans-serif;'>"
             + "<h1>Ambiente de Staging (Spring Boot + Java 21)</h1>"
             + "<h2 style='color:#2980b9;'>Versão 2.0 - Segunda Integração Jenkins!</h2>"
             + "</div>";
    }
}