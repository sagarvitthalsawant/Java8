package com.java;

import java.util.function.Consumer;

public class ConsumerFunction {

    public static void main(String[] args) {

        Consumer<String> consumer = i -> System.out.println(i + "Some string name goes here");
        Consumer<String> consumer1 = i -> System.out.println(i + "Some string name goes here 1");
        Consumer<String> consumer2 = i -> System.out.println(i + "Some string name goes here 2");
        Consumer<String> consumer3 = i -> System.out.println(i + "Some string name goes here 3");
        Consumer<String> consumer4 = i -> System.out.println(i + "Some string name goes here 4");

        Consumer<String> consumer5 = consumer.andThen(consumer1).andThen(consumer2).andThen(consumer3).andThen(consumer4);

        String s = "testString";
        consumer5.accept(s);

    }
}
