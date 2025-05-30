package com.aminbassim.ollama.controllers;

import com.aminbassim.ollama.services.OllamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class OllamaController {

    @Autowired
    private OllamaService ollamaService;

    @GetMapping("in")
    public String generate(@RequestParam(value = "message") String message) {
        return ollamaService.generateResult(message);
    }
}
