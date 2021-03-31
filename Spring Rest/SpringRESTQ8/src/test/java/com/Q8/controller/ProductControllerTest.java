package com.Q8.controller;


import com.Q8.config.AppConfig;
import com.Q8.model.Product;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AbstractTestContextBootstrapper;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;
import javax.ws.rs.core.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
@WebAppConfiguration
public class ProductControllerTest {
    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    ObjectMapper om =new ObjectMapper();

    @Before
    public void setup() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void givenWac_whenServletContext_thenItProvidesGreetController() {
        ServletContext servletContext = wac.getServletContext();

        Assert.assertNotNull(servletContext);
        Assert.assertTrue(servletContext instanceof MockServletContext);
        Assert.assertNotNull(wac.getBean("productController"));
    }


    @Test
    public void getAllProducts() throws Exception {
        this.mockMvc.perform(get("/products")).andExpect(status().isOk());
    }


    @Test
    public void getProduct() throws Exception {
        this.mockMvc.perform(get("/products/10")).andExpect(status().isOk());
    }

   @Test
   public void addProduct() throws Exception {
       Product product = new Product();
       product.setId("11");
       product.setProductCost(100.0);
       product.setProductName("Anti dandruff shampoo");
       String jsonReq =om.writeValueAsString(product);
        this.mockMvc.perform(post("/products").content(jsonReq).contentType(MediaType.APPLICATION_JSON)
        ).andExpect(status().isOk());
    }

    @Test
    public void deleteProduct() throws Exception {
        this.mockMvc.perform(delete("/products/10")).andExpect(status().isOk());
    }



}