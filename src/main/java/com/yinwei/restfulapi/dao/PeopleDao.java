package com.yinwei.restfulapi.dao;

import com.yinwei.restfulapi.pojo.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.NamedParameterJdbcOperationsDependsOnPostProcessor;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;

public interface PeopleDao {
    Long insertPeople(People people);
}
