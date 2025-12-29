package org.example.movieserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class HelloController {
    @CrossOrigin(origins = "*")
    @GetMapping("/hello")
    public String hello() {
        return "Hello World! 여기는 스프링부트 서버입니다!";
    }
}
