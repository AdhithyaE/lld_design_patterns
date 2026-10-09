package com.structural.proxy;

public class RealSubject implements Subject{
    @Override
    public void method() {
        System.out.println("The processing is successful!");
    }
}
