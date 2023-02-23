package com.med.voll.api.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/msg")
public class HelloController {

    @GetMapping
    public String sendMessage() {
        return "Seja bem vindo a nossa APII";
    }
}
