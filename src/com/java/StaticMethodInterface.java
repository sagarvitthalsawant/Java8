package com.java;

public class StaticMethodInterface implements StaticTestA , StaticTestB{
//    public class StaticMethodInterface{

    public static void main(String[] args) {
        StaticTestA.testMethod();
        StaticTestB.testMethod();
    }
}
