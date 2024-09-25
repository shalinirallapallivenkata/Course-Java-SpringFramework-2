package org.springframeworkdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframeworkdemo.config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //  Searches for this configuration in AppConfig
        // for this error when removing the AppConfig add @ComponentScan("org.springframeworkdemo") in AppConfig
        // Analysis analysis = context.getBean("analysis", Analysis.class); // adding bean name
        // Default name of bean name is name of method.

        // Analysis analysis = context.getBean("analysis", Analysis.class);
        // Adding bean name in bean annotation as attribute
        //Analysis analysis = context.getBean(Analysis.class);
        // All beans are singleton ---> prototype
        // making a bean primary
        //analysis.compile();

        //Analysis analysisOne = context.getBean(Analysis.class);
        //analysisOne.compile();
        //In total only one object but method call two times
        // what if we need two different objects

        Develop object = context.getBean(Develop.class);
        System.out.println(object.getAge());
        object.code();
        // code is dependent on object of computer
        // no link between code and develop






        // ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // in the class path mention the xml --> providing the bean and beans tags for container to communicate with Spring Framework
        //ClassPathXmlApplicationContext extends Bean Factory
        //Develop object = (Develop) context.getBean("develop");
        // object.code();

        // If above teo lines are commented still an object will be created and the constructor of develop class will be called
        // Error occurs in line 16
        // Container is created. The container should interact with Spring Framework
        // can be done in XM, Java based config or XML
        //changing age value with object here
//        object.age= 30;
//        System.out.println(object.age);
        // both print same age 30


         //Develop objectOne = (Develop) context.getBean("develop");
         // objectOne.code();
         //System.out.println(objectOne.age);

         // will fetch the same bean object created in container but creating a different context object to access code method
         // to create new object everytime we do  get bean use scope = prototype not singleton

         //checking this


         // two one objects created in container if two beans configured in xml with same name but different id
         // scope of bean singleton, prototype, request, session etc. We use singleton and prototype in Spring framework
        // Prototype --> object is created only when getBean()
        // When scope is singleton the moment the container is loaded default is singleton

        // Develop object = context.getBean("develop", Develop.class);
        // get bean returns Object of Object not of this class. So no need type casting
        // object.setAge(30);
        // object.code();
        // System.out.println(object.getAge());
        //Analysis analysis =context.getBean("compileOne", Analysis.class);

//        Computer  computer= context.getBean(Computer.class);
//        // every interface gets cf compiled to .class file
//        Analysis  analysis= context.getBean(Analysis.class);

        // if not mentioned primary two classes are implementing same interface  and we get error two beans of same type

    }

}
