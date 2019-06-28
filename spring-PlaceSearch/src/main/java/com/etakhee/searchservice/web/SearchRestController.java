package com.etakhee.searchservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchRestController {
    @GetMapping("/Hello")
    public String hello() {
        return "Hello World!";
    }
}
