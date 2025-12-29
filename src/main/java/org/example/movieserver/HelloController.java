package org.example.movieserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class HelloController {
    @CrossOrigin(origins = "*")
    @GetMapping("/hello")
    public String hello() {
        return "Hello World! 서버테스트중!";
    }
}
