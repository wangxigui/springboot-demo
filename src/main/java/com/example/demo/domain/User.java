package com.example.demo.domain;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class User {

    private Logger logger = LogManager.getLogger(getClass());
    @Value("${name}")
    private String name;

    @Value("${age}")
    private int age;


    public String print(){

        String str =  "name: " + this.name + ", age:" + this.age;
        logger.warn(str);

        return str;
    }
}
