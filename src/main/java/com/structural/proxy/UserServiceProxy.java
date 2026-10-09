package com.structural.proxy;

public class UserServiceProxy {
    private UserService service;
    private boolean isAdmin;

    UserServiceProxy(UserService service, boolean isAdmin) {
        this.service = service;
        this.isAdmin = isAdmin;
    }

    void deleteUser(int userId) {
        if (isAdmin) {
            service.deleteUser(userId);
        } else {
            throw new SecurityException("Access denied");
        }
    }
}
