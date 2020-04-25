package com.java;

import java.util.function.Function;
import java.util.function.Predicate;

public class UnderstandingFunction {

    public static void main(String[] args) {
        Function<Integer, Integer> fun = i -> i*i;
        System.out.println("Square root is "+fun.apply(4));

        Predicate<Integer> predicate = i-> i%2==0;
        System.out.println("is number even "+predicate.test(4));
        System.out.println("is number even "+predicate.test(5));
    }
}
