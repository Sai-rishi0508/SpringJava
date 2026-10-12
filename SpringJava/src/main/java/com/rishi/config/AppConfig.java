package com.rishi.config;

import com.rishi.Engineer;
import com.rishi.Human;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.rishi")//this will check whether a class has @Component annotation
public class AppConfig {
/*
    //@Bean(name = {"human","human1","human2"}) like this we can specify a single or multiple names for a bean
    @Bean
    //@Scope("prototype")
    // public Human human(@Qualifier("engineer") Engineer eng){
    public Human human(Engineer eng){
        //default name for a bean is its method name in configuration class
        Human obj=new Human();
        obj.setAge(21);
        //obj.setEngineer(engineer());
        obj.setEngineer(eng);
        return obj;
    }
    @Bean
    @Primary
    public Engineer engineer(){
        System.out.println("Bean 1 of engineer");
        //engineer().setHuman();
        return new Engineer();
    }
    @Bean
    //@Scope("prototype")
    public Engineer engineer1(){
        System.out.println("Bean 2 of engineer");
        return new Engineer();
    }

 */
/*
    @Qualifier-> in this we can specify whether to choose which bean if two beans are refering to one class
    instead of Qualifier we can use Primary
    instead of creating beans for spring what if spring manages everything we can achieve that by adding @Component annotation on top of each class you want Beans of!!
    when there are two beans of same type spring will get confused in such case we can use Qualifier and while giving it bean name give its class name in lowercase letters!!
    or at @Component we can specify a name for our bean!!
    the autowired is basically injecting the object there are three levels of injecting:
    1.Field injection
    2.Constructor injection
    3.Setter injection
    in field injection the object is directly injected into a field(variable)
    for a second level we need a Constructor which takes the Filed as a parameter on top of that constructor we have to place @Autowired
    just like that for a particular field we will be having setter method on top of it we have to add @autowired
    as we discussed about Qualifier we also have alternative for that its primary
    whatever class we want to be selected we just have to add @Primary at top .
    but if we use primary and qualifier at a time the sping will choose qualfier over primary
    and also for scope we can define those class's scope on top of that class name
    by using @Value we can assign default values for fields
    for example we have default value but we have assigned a value using setter method the spring will consider the value we have deined explicitly
    */
}
