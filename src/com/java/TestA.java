package com.java;

public interface TestA {

    default void testMethod(){
        System.out.println("In Interface TestA");
    }
}
