package com.Q7.controller;

import com.Q7.config.AppConfig;
import com.Q7.model.Order;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;
import javax.ws.rs.core.MediaType;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
@WebAppConfiguration
public class OrderControllerTest {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    ObjectMapper om =new ObjectMapper();

    @Before
    public void setup() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }



    @Test
    public void getAllOrder() throws Exception {
        this.mockMvc.perform(get("/orders")).andExpect(status().isOk());
    }


   @Test
   public void addOrder() throws  Exception{
       Order order = new Order();
       order.setItem("coffe");
       order.setId("15");
       order.setAmountPaid(50);

       String jsonRes = om.writeValueAsString(order);
       this.mockMvc.perform(post("/orders").content(jsonRes).contentType(MediaType.APPLICATION_JSON))
               .andExpect(status().isOk());

    }

    @Test
    public void getOrderById() throws Exception {
        this.mockMvc.perform(get("/orders/15")).andExpect(status().isOk());
    }

   @Test
   public void deleteOrder() throws Exception {
        this.mockMvc.perform(delete("/orders/15")).andExpect(status().isOk());
    }
}