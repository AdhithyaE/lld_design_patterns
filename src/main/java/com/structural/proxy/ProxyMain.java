package com.structural.proxy;

public class ProxyMain {
    public static void main(String[] args) {
        Subject proxy = new ProxySubject();
        proxy.method();

        Image image = new ImageProxy("hELLO.java");
        image.display();

        Image imageHighProcessing = new ImageProxy("hELLO.java");
        image.display();

        UserService userService = new UserService();
        UserServiceProxy userServiceProxy = new UserServiceProxy(userService, true);
        userServiceProxy.deleteUser(1);



    }
}

//The Proxy Design Pattern is a structural design pattern used when you want to control access to another object by placing a substitute object (the proxy) in front of it.
//
//Think of a proxy as a middleman between the client and the real object.
//
//When do we use the Proxy Pattern?
//We commonly use it in these situations:
//
// 1. Lazy Initialization (Virtual Proxy)
//Use it when creating an object is expensive, and you want to create it only when it's actually needed.
//
//Example: Loading a high-resolution image only when the user opens it.
//Why use it? The image loads only when display() is called, saving resources if the image is never viewed.


//2. Access Control (Protection Proxy)
//Use it when only authorized users should access an object or operation.
//
//Example: Only administrators can delete user accounts.

//Why use it? The proxy checks permissions before forwarding the request to the real service.
//
//        3. Remote Access (Remote Proxy)
//Use it when an object exists on another machine or server, but you want to interact with it as if it were local.
//
//        Example: A client application calls a remote payment service through a proxy.
//
//Why use it? The proxy hides the communication details, such as network requests and serialization.
//
//4. Logging and Monitoring
//Use it when you want to track method calls without changing the original class.
//
//Example: Logging how often a payment service is called and how long each call takes.
//
//Why use it? The proxy can log the request, delegate it to the real object, and record the result.
//
//        5. Caching
//Use it when repeated requests return the same or reusable data, and you want to avoid expensive operations.
//
//        Example: A proxy caches product details so it doesn't query the database every time.
//
//Why use it? It reduces database load and can improve response time.
//
//How does the Proxy Pattern work?
//        Client  => Makes a request
//
//        Proxy  = > Checks access, caches, logs, or delays creation
//
//        Real Object  = > Performs the actual operation
//
//The client usually interacts with the proxy through the same interface as the real object. The proxy decides what to do before forwarding the request.
