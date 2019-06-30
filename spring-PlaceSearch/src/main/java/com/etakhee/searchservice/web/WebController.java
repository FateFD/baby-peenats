package com.etakhee.searchservice.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import lombok.*;

@Controller
@AllArgsConstructor
public class WebController {
    @GetMapping("/")
    public String main() {
        return "main";
    }
}
