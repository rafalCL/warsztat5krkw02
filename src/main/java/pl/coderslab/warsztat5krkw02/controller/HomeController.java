package pl.coderslab.warsztat5krkw02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping(path = "",
            produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String main(){
        return "Działa!!! :)";
    }
}
