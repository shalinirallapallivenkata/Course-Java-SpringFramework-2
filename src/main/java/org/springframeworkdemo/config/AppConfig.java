package org.springframeworkdemo.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframeworkdemo.Analysis;
import org.springframeworkdemo.Code;
import org.springframeworkdemo.Computer;
import org.springframeworkdemo.Develop;

@Configuration // if we use java based configuration this annotation is used and we need to use Bean annotation
@ComponentScan("org.springframeworkdemo")
public class AppConfig {

    //@Bean(name={"beanName", "beanOne", "beanTwo"}) // For spring to create the object. Can have multiple name
    // @Bean
    // @Scope("prototype") // creates two objects or multiple objects if scope is prototype
    // public Analysis analysis() {
        // return new Analysis(); // Java based configuration we gotta manually create the object
        // we have to create the object. Spring is injecting the object. Spring will create , manage and inject the object
        // Executed by Spring
    }

//    @Bean
//    @Primary
//    public Code code() {
//        return new Code();
//    }
    // Throws error no matching bean of computer i.e: code


    // @Bean
    // public Develop develop(@Autowired Computer objectOne){
    // public Develop develop(@Qualifier("code") Computer objectOne){ // Qualifier--> mention bean name same as xmls ref
    // if not qualifier use @primary for the bena
    // public Develop develop(Computer objectOne){
        // @Autowired had to be mentioned now not necessary
        // Develop object = new Develop(); // setting primitive value age here with the object
       // object.setAge(26);
        // we need to have the compile object too as it is in Develop for that we need Computer object
        // Analysis is implementation of Computer
        // object.setCompile(objectOne);// we are tightly coupling  can be code or analysis
        // in constructor add Computer object
        // return object;
        // return new Develop();
    //}
//}
