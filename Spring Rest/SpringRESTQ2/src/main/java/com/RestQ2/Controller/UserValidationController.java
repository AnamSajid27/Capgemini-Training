package com.RestQ2.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.URL;
import java.util.Scanner;

@RestController
public class UserValidationController {

    @RequestMapping(value = "/validate/{username}/{password}",method = RequestMethod.GET)
    public String validateUser(@PathVariable String  username,@PathVariable String password){
        if(username.equals("neeraj") && password.equals("test"))
             return "Valid User";
        else
            return "Invalid User";

    }
}
