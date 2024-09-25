package org.springframeworkdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("analysis")
@Primary // Makes analysis preferable when there is confusion`
@Scope("prototype")
public class Analysis implements Computer{
    // need to implement compile abstract method in Computer

    public Analysis() {
        System.out.println("Default Analysis Constructor");
    }
    @Override
    public void compile() {
        System.out.println("Compiling in Analysis Class");
    }
}
