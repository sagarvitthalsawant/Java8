package com.java;

import java.util.function.IntPredicate;

public class IntPredicateLogic {

    public static void main(String[] args) {
        int[] demo = {0, 5, 1, 15, 20, 25, 30, 35, 40};
        IntPredicate predicate = i -> i % 2 == 0;
        for (int number:demo ) {
            if (predicate.test(number)){
                System.out.println(number);
            }
        }
    }
}
