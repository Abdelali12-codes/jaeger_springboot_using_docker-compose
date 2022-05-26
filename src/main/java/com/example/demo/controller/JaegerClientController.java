package com.example.demo.controller;


import com.example.demo.service.JaegerClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/jaeger/client")
public class JaegerClientController {

    private JaegerClientService jaegerClientService;

    public JaegerClientController(JaegerClientService jaegerClientService) {
        this.jaegerClientService = jaegerClientService;
    }
    @GetMapping("/hello")
    public String hello()
    {
        return "Hello javaTpoint";
    }


    /*public Mono<String> get(@PathVariable("id") Integer id) {
        return jaegerClientService.get(id);
    }*/
}