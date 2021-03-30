package com.Q9.controller;

import com.Q9.config.AppConfig;
import com.Q9.model.customer;
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


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
@WebAppConfiguration
public class CustomerControllerTest {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    ObjectMapper om =new ObjectMapper();

    @Before
    public void setup() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void getAllDetails() throws Exception {
        this.mockMvc.perform(get("/customer")).andExpect(status().isOk());
    }

    @Test
    public void getCustomerById() throws Exception {
        this.mockMvc.perform(get("/customer/15")).andExpect(status().isOk());
    }

    @Test
    public void addCustomer() throws  Exception {
        customer  customer = new customer();
        customer.setId(69);
        customer.setEmail("test@Gmail.com");
        customer.setAddress("test");
        customer.setName("test");

        String jsonRes = om.writeValueAsString(customer);
        this.mockMvc.perform(post("/customer").content(jsonRes).contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }

    @Test
    public void deleteCustomer() throws Exception {
        this.mockMvc.perform(delete("/customer/10")).andExpect(status().isOk());
    }


}