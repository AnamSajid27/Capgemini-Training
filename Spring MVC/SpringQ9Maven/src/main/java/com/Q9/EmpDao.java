package com.Q9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class EmpDao {
@Autowired
JdbcTemplate jdbcTemplate;

@Autowired
public  void setJdbcTemplate(JdbcTemplate jdbcTemplate){
    this.jdbcTemplate = jdbcTemplate;
}


public List<Employee> getEmployeeByPageNO(int pageNo,int total){
    String sql = "select * from employee limit "+(pageNo-1)+","+total;
    return jdbcTemplate.query(sql, new RowMapper<Employee>() {
        public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
            Employee emp = new Employee();
            emp.setId(resultSet.getInt(1));
            emp.setName(resultSet.getString(2));
            emp.setSalary(resultSet.getInt(5));
            return  emp;
        }
    });
}
}
