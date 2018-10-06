package com.example.demo.service;

import com.example.demo.dao.PersonDao;
import com.example.demo.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonDao personDao;

    public List<Person> getPerson(long id){
        return personDao.getPerson(id);
    }
}
