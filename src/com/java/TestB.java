package com.java;

public interface TestB {

    default void testMethod(){
        System.out.println("In Interface TestB");
    }
}
