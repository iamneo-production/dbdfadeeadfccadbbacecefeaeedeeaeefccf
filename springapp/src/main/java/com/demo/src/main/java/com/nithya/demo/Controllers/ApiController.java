package com.nithya.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    
    @GetMapping("/welcome") 
        public String Display(){
            return "Welcome";
        }
    
}
