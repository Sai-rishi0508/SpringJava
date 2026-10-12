package com.rishi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("hum")
//@Scope("prototype")
public class Human {
    private String name;

    @Value("20")
    private int age;

    @Autowired
    @Qualifier("emp")
    private Work works;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   /* public Engineer getEngineer() {
        return engineer;
    }

    public void setEngineer(Engineer engineer) {
        this.engineer = engineer;
    }
*/
    public Human(){
        System.out.println("Human object is Created!!");
    }
    public void species(){
        System.out.println("Is an Human!!");
        works.work();
    }
}
