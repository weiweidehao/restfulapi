package com.yinwei.restfulapi.controller;

import com.yinwei.restfulapi.pojo.People;
import com.yinwei.restfulapi.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping
public class PeopleController {
    @Autowired
    private PeopleService peopleService;
    @RequestMapping(value = "/people",method = POST,produces = "application/json")
    public WebResponse<Map<String,Object>>savePeople(@RequestBody People people){
        people.setName(1L);
        return response;

    }
}
