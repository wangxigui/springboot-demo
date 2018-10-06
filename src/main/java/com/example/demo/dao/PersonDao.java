package com.example.demo.dao;

import com.example.demo.domain.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PersonDao {

    @Select("select id, name, age from person where id::bigint=#{pId}")
    public List<Person> getPerson(long pId);
}
