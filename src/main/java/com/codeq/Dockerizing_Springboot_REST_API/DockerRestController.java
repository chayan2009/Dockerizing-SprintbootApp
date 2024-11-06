package com.codeq.Dockerizing_Springboot_REST_API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerRestController {
    
    @GetMapping("/message")
    public String getName(){
        return "Dockerizing sprintbootApp";
    }
}
