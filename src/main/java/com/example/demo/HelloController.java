package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.example.demo.domain.User;
import com.example.demo.service.PersonService;
import com.example.demo.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    private Logger logger = LogManager.getLogger(HelloController.class);
    @Autowired
    private UserService service;
    @Autowired
    private PersonService personService;

    @RequestMapping("/hello")
    public String say(){
        return "hello, world";
//        System.out.println(" ------ this is the frist request ------- ");
//        logger.info(personService.getPerson(2l));
//        return this.jsonTest();
    }

    public String jsonTest(){
        String test = "{'name': 'wxg'}";
        final String s = JSON.toJSONString(test);
        service.print();
        return s;
    }
}

