package com.rishi;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("eng")
@Primary
public class Engineer implements Work{
    private String dept;
    private int id;


    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public Engineer(){
       // System.out.println("Engineer object created!");

    }
    public void work(){
        System.out.println("In engineer class!");

    }

}
