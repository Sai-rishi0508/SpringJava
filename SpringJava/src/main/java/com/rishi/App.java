package com.rishi;

import com.rishi.config.AppConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Human hum=context.getBean(Human.class);
        Human hum1=context.getBean(Human.class);
        //hum.species();
        //hum.setAge(21);
        //System.out.println(hum.getAge());
    }
}
