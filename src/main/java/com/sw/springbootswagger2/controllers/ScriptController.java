package com.sw.springbootswagger2.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScriptController {

    @GetMapping(value="/")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("bbbb");
    }

}
