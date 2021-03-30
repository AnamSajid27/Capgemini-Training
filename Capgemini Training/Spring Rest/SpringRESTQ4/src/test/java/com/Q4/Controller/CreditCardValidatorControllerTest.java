package com.Q4.Controller;

import com.Q4.Config.AppConfig;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Nested;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@WebAppConfiguration
public class CreditCardValidatorControllerTest {
    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    ObjectMapper om =new ObjectMapper();

    @Before
    public void setup() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void validVisa14Digit() throws Exception {
        this.mockMvc.perform(get("/validate/4929560407292559")).andExpect(content().string("Visa"));
    }

    @Test
    public void validVisa16Digit() throws Exception {
        this.mockMvc.perform(get("/validate/4485585759433997742")).andExpect(content().string("Visa"));
    }

    @Test
    public void validMasterCard() throws  Exception{
        this.mockMvc.perform(get("/validate/2720993348630105")).andExpect(content().string("MasterCard"));
    }


    @Test
    public void validJCB() throws Exception{
        this.mockMvc.perform(get("/validate/3589280727810526")).andExpect(content().string("JCB"));
    }

    @Test
    public  void validJCB19Digiti() throws  Exception{
        this.mockMvc.perform(get("/validate/3537534590039017838")).andExpect(content().string("JCB"));

    }
    @Test
    public  void validDiscover() throws  Exception{
        this.mockMvc.perform(get("/validate/6011390526053656")).andExpect(content().string("Discover"));

    }
}

