package com.backend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class ControllerTest {

    @GetMapping("/hw")
    public String hw() {
        return "Hello World";
    }
}
