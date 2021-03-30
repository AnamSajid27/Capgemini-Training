package com.RESTApi;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String FirstRestApi(){
        return "Hello World";
    }
}
