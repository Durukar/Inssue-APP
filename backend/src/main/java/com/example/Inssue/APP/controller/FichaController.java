package com.example.Inssue.APP.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "ficha")
public class FichaController {

    @GetMapping(value = "/all")
    public void getAll(){
    }
}
