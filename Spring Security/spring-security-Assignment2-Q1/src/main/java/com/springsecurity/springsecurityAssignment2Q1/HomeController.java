package com.springsecurity.springsecurityAssignment2Q1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home(){
        return ("<h1>Welcome Home</h1>");
    }
    @GetMapping("/user")
    public String user(){
        return ("<h1>Welcome Home user</h1>");
    }
    @GetMapping("/admin")
    public String admin(){
        return ("<h1>Welcome Home admin</h1>");
    }
}
