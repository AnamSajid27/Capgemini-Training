package com.Q5.controller;

import com.Q5.Entities.employee;
import com.Q5.config.AppConfig;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
@WebAppConfiguration
public class EmployeeControllerTest {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    ObjectMapper om =new ObjectMapper();

    @Before
    public void setup() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void getAllDetails() throws Exception{
        this.mockMvc.perform(get("/employee")).andExpect(status().isOk());
    }

    @Test
    public void getEmployeeById() throws  Exception {
        this.mockMvc.perform(get("/employee/31")).andExpect(status().isOk());
    }

    @Test
    public void addEmployee() throws Exception {
        employee e = new employee();
        e.setEmployeeId(89);
        e.setEmployeeName("testJunit");
        e.setEmployeeSalary("50000");
        e.setEmployeeDepartment("It");
        e.setEmployeeDesignation("tester");

        String jsonRes = om.writeValueAsString(e);
        this.mockMvc.perform(post("/employee").content(jsonRes).contentType(MediaType.APPLICATION_JSON));
    }
    @Test
    public void deleteEmplolyee() throws  Exception{
        this.mockMvc.perform(delete("/employee/20")).andExpect(status().isOk());
        }


    }
