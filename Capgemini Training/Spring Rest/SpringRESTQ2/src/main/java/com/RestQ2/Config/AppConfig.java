package com.RestQ2.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.RestQ2"})
public class AppConfig {

         @Bean
         public InternalResourceViewResolver viewResolver(){
             InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
             viewResolver.setViewClass(JstlView.class);
             viewResolver.setPrefix("/WEB-INF/");
             viewResolver.setSuffix(".jsp");
             return  viewResolver;
         }
}
