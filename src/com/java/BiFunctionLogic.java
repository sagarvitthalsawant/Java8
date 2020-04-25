package com.java;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class BiFunctionLogic {

    public static void main(String[] args) {

        ArrayList<Pojo> pojo = new ArrayList<Pojo>();

        BiFunction<String, Double, Pojo> biFunction = (a, b) -> new Pojo(a, b);
        pojo.add(biFunction.apply("aaa", 80.00));
        pojo.add(biFunction.apply("aab", 81.00));
        pojo.add(biFunction.apply("abb", 82.00));
        pojo.add(biFunction.apply("bba", 83.00));

        for (Pojo pojo1 : pojo){
            System.out.println("Printing this "+pojo1.name+" "+pojo1.salary);
        }

    }
}
