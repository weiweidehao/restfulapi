package com.yinwei.restfulapi.service;

import com.yinwei.restfulapi.pojo.People;

public class PeopleService {
    public int insertPeople(People people);
    public int updatePeople(People people);
    public int deletePeople(People people);
    public List<People> findAll();
}
