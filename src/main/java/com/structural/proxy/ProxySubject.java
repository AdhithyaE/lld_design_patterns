package com.structural.proxy;

public class ProxySubject extends RealSubject{
    @Override
    public void method() {
        System.out.println("Validating the request");
        System.out.println("Validation is success - calling real method");
        super.method();
    }
}
