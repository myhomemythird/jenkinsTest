package org.richardliao.microservice.eureka.controller;

import org.richardliao.microservice.eureka.service.ServiceHiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    ServiceHiClient serviceClient;
    
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi(@RequestParam String name){
        return serviceClient.sayHiFromClient(name);
    }

}
