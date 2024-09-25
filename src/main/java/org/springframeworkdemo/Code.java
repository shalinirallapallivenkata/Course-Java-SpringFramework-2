package org.springframeworkdemo;

import org.springframework.stereotype.Component;

@Component("code")
public class Code implements Computer {

    public Code(){
        System.out.println("Default Code constructor");
    }

    @Override
    public void compile() {
        System.out.println("Compiling in Code class");
    }


}
