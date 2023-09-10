package com.gizaSystem.service;

public abstract class AbstractClassEx {

    public String sayHi() {
        return "hi" ;
    }
    public String sayHello() {
        return "Hii.. " + getName() + symbol() ;
    }

    private String symbol() {
        return "!!";
    }

    protected abstract String getName();
}
