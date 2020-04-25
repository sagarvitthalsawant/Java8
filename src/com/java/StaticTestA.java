package com.java;

public interface StaticTestA {

    public static void testMethod(){
        System.out.println("In Interface StaticTestA static method");
    }

    public static void main(String[] args) {
        System.out.println("Static main method are allowed inside interface");
        testMethod();
    }
}
