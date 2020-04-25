package com.java;

public class MultipleInheritance implements TestA, TestB{

    @Override
    public void testMethod() {
        System.out.println("Overide default method to achieve multiple Inheritance");

//        TestA.super.testMethod();
//        TestB.super.testMethod();
    }

    public static void main(String[] args) {
        MultipleInheritance multipleInheritance = new MultipleInheritance();
        multipleInheritance.testMethod();
    }
}
