package org.example.testspringbootapp;

import org.springframework.web.bind.annotation.*;

@RestController
public class EchoController {

    @GetMapping(value = "/{pathVariable}")
    public String echoGet(@PathVariable String pathVariable){
        return pathVariable;
    }

    @PostMapping(value = "/")
    public String echoPost(@RequestBody String body){
        return body;
    }
}
