package com.yinwei.restfulapi.impl;

import com.yinwei.restfulapi.dao.PeopleDao;
import com.yinwei.restfulapi.pojo.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.NamedParameterJdbcOperationsDependsOnPostProcessor;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class PeopleDaoImpl implements PeopleDao {
    //导入jdbctemplate模板
    private JdbcTemplate jdbcTemplate;
    @Override
    public Long insertPeople(People people) {
        return jdbcTemplate.update("insert into teacher(tname) values(?)",grade.getTname());
    }
    @Override
    public int updateGrade(Grade grade) {
        return jdbcTemplate.update("update teacher set tname=? where tid=?",grade.getTname(),grade.getTid());
    }

    @Override
    public int deleteGrade(Integer tid) {
        return jdbcTemplate.update("delete from teacher where tid=?",tid);
    }

    @Override
    public List<Grade> findAll() {
        //封装行数据映射
        RowMapper<Grade> rowMapper=new RowMapper<Grade>() {
            @Override
            public Grade mapRow(ResultSet rs, int rowNum) throws SQLException {
                Grade grade=new Grade(rs.getInt("tid"),rs.getString("tname"));
                return grade;
            }
        };
        return jdbcTemplate.query("select * from teacher", rowMapper);
    }
}
}
