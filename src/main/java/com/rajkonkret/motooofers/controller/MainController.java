package com.rajkonkret.motooofers.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/powitanie")
    public String index() {
        return "index";
    }
}
