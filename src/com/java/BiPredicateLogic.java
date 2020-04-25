package com.java;

import java.util.function.BiPredicate;

public class BiPredicateLogic {

    public static void main(String[] args) {

        BiPredicate<Integer, Integer> biPredicateLogic = (a, b) -> (a+b) %2 ==0;
        System.out.println(biPredicateLogic.test(30, 40));
    }
}
