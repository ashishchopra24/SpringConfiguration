package com.example.springconfiguration;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:Configuration.xml")
public class SpringConfigurationApplication {

    public static void main(String[] args) {
       ApplicationContext ctx= SpringApplication.run(SpringConfigurationApplication.class, args);
        Country object=(Country)ctx.getBean("country");
        System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();

        System.out.println("Country Name "+object.getName());
        System.out.println("Population "+object.getPopulation());
    }

}
