package pl.coderslab.warsztat5krkw02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @GetMapping("/hello")
    public String hello(){
        return "{hello: World}";
    }
}
