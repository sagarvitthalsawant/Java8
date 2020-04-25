package com.java;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class IntFunctionLogic {
    public static void main(String[] args) {
//        Function<Integer, Integer> function = i -> i*i;
//        System.out.println(function.apply(25));

        IntFunction<Integer> function = i -> i*i;
        System.out.println(function.apply(25));

        ToIntFunction<String> stringToIntFunction = i -> i.length();
        System.out.println(stringToIntFunction.applyAsInt("someText"));

    }
}
