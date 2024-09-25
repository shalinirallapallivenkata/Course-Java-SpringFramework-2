package org.springframeworkdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
// Stereotype annotation in Spring framework asking Spring to manage the objects for it// can be used in all the classes
// makes any configuration for java based configuration or xml based to be removed
public class Develop {
   @Value("32") // use value if the values need to be injected from elsewhere and not initializing the value -- hard code
    private int age;
     //    private Code compile = new Code();
    // private Code compile; // private variable have getter setters.
    // Code object to access object in Develop class
    // No object for compile null pointer exception will be thrown if compile method is called from Code class

    //@Autowired // makes spring find the compile object in container with this annotation
    // When no java based or xml based configuration established this is for connection between code and analysis
    // when we run this there are two @Components using the Computer interface
    // if we comment @Component in one of it, it works
    // However, we can use qualifier or scope
    // Autowired --- injecting the object


    // Autowire injection:
    // - Field injection
    // -Constructor Injection
    // -Setter Injection
    //Above injection is : Field injection


    //@Qualifier("code") // bean name here classname in lowercase
    // qualifier has more preference on primary even though analysis is primary
    // name of bean can be mentioned next to @Component(code)
    private Computer compile;

    private int salary;


    // assigning values when we get the object using constructor
//    public Develop() { // Constructor --- Default constructor
//        System.out.println("Calling Default Develop constructor and creating develop object");
//    }

//    public Develop(int age) {
//        System.out.println("Another Parameter Constructor: - Calling Develop constructor with parameter and creating develop object");
//        this.age = age;
//    }

//    public Develop(int age, Code compile) {
//        System.out.println("Two Parameter Constructor:- ");
//        this.age = age;
//        this.compile= compile;
//    }

//    @ConstructorProperties({"age","compile", "salary"}) // need to mention is sequence
//    public Develop(int age, Code compile, int salary) {
//        System.out.println("Three Parameter Constructor:- ");
//        this.age = age;
//        this.compile= compile;
//        this.salary=salary;
//    }
//
//    public int getAge(){
//        return age;
//    }
//    public void setAge(int age){
//        System.out.println("Setter called");
//        this.age = age;
//    }
//
//    public  Code getCompile() {
//        return compile;
//    }
//
//    public void setCompile(Code compile) {
//        this.compile = compile;
//    }
//
//    public void code() {
//        System.out.println("Second class used for Spring framework example");
//        compile.compile();
//    }

    // @ConstructorProperties({"age", "salary", "compile"})
//    public Develop(int age, int salary, Computer compile) {
//        this.age= age;
//        this.salary = salary;
//        this.compile=compile;
//    }

    public Develop() {
        System.out.println("Default Develop constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Set age to " + age);
        this.age = age;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Computer getCompile() {
        return compile;
    }

    @Autowired // setter injection makes sense to write here at setter as it is setter injection
    @Qualifier("code")
    public void setCompile(Computer compile) { // If we pass object of Code the compile() of Code will execute
        // if we pass object of Analysis the compile() of Analysis will execute
        // in app config for no xml or java based config code has this method and no connection established thus use
        // @Autowired annotation which is a factory annotation
        this.compile = compile;
    }

    public void code() {
        // System.out.println("code method in code class");
        compile.compile();

    }
}
