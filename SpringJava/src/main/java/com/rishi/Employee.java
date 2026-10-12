package com.rishi;

import org.springframework.stereotype.Component;

@Component("emp")
public class Employee implements Work{
   public void work(){
       System.out.println("in employee class");
   }
}
