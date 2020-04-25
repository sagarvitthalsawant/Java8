package com.java;

import java.util.function.Function;

public class CreatingFunctionalInterface {

    public static void main(String[] args) {

        Function<Integer, Integer> fun = i-> i*i;
        System.out.println(fun.apply(25));
    }
}
