package com.Q6.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET)
    public int add(@PathVariable int a,@PathVariable int b){
        return  a+b;
    }

    @RequestMapping(value = "/subtract/{a}/{b}",method = RequestMethod.GET)
    public int subtract(@PathVariable int a,@PathVariable int b){
        return  a-b;
    }
    @RequestMapping(value = "/multiply/{a}/{b}",method = RequestMethod.GET)
    public int multiply(@PathVariable int a,@PathVariable int b){
        return  a*b;
    }
    @RequestMapping(value = "/divide/{a}/{b}",method = RequestMethod.GET)
    public double division(@PathVariable int a,@PathVariable int b){
        return  a/b;
    }

    @RequestMapping(value = "/sqrt/{a}",method = RequestMethod.GET)
    public double squareRoot(@PathVariable int a){
        return  Math.sqrt(a);
    }
}
