package com.creational.prototype;

public class ProfessionMain {
    public static void main(String[] args) {
        //load the cache
        ProfessionCache.loadProfessionCache();
        // return the required object
        Profession myProfesssion = ProfessionCache.getCloneOfNewProfession(3);
        myProfesssion.print();
    }
}
