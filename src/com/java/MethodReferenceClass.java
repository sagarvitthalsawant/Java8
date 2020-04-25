package com.java;

public class MethodReferenceClass {

    public static void addition(int a, int b){
        System.out.println("Answer is in class "+(a+b));
    }

    public static void main(String[] args) {

//        MethodReferenceInterface methodReferenceInterface = (a, b) -> System.out.println("Answer is "+(a+b));
//        methodReferenceInterface.add(40, 50);

//        MethodReferenceClass methodReferenceClass = new MethodReferenceClass();
        MethodReferenceInterface methodReferenceInterface = MethodReferenceClass::addition;
        methodReferenceInterface.add(40, 45);
    }
}
