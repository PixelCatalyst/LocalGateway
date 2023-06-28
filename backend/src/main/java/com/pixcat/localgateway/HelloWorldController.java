package com.pixcat.localgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.MediaType;

@RestController
public class HelloWorldController {

    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    String getHelloString() {
        return "Hello World!";
    }
}
