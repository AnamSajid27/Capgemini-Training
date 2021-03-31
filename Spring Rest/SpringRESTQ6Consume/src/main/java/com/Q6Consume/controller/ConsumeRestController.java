package com.Q6Consume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumeRestController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/add/{a}/{b}")
    public int add(@PathVariable int a,@PathVariable int b){
        String uri = "http://localhost:8080/SpringRESTQ6/add/"+a+"/"+b;
        int res = restTemplate.getForObject(uri,Integer.class);
        return  res;

    }

    @RequestMapping(value = "/subtract/{a}/{b}",method = RequestMethod.GET)
    public int subtract(@PathVariable int a,@PathVariable int b){
        String uri = "http://localhost:8080/SpringRESTQ6/subtract/"+a+"/"+b;
        int res = restTemplate.getForObject(uri,Integer.class);
        return  res;
    }
    @RequestMapping(value = "/multiply/{a}/{b}",method = RequestMethod.GET)
    public int multiply(@PathVariable int a,@PathVariable int b){
        String uri = "http://localhost:8080/SpringRESTQ6/multiply/"+a+"/"+b;
        int res = restTemplate.getForObject(uri,Integer.class);
        return  res;
    }
    @RequestMapping(value = "/divide/{a}/{b}",method = RequestMethod.GET)
    public double division(@PathVariable int a,@PathVariable int b){
        String uri = "http://localhost:8080/SpringRESTQ6/divide/"+a+"/"+b;
        double res = restTemplate.getForObject(uri,Double.class);
        return  res;
    }

    @RequestMapping(value = "/sqrt/{a}",method = RequestMethod.GET)
    public double squareRoot(@PathVariable int a){
        String uri = "http://localhost:8080/SpringRESTQ6/sqrt/"+a;
        double res = restTemplate.getForObject(uri,Double.class);
        return  res;
    }
}
