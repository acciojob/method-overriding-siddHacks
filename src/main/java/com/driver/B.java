package com.driver;

//step-2
public class B extends A{


    public B(){
        System.out.println(super.meth());
    }

    //step -4
    //overriding method meth()
    @Override
    public String meth(){
        return "Method is overridden in Extendend class B";
    }
}
