package com.abhi.practicea.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeController {

    @GetMapping("/message")
    public String getMessage(){
        return "message api successful";
    }
}
