package com.java;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsLogic {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(5);list.add(15);list.add(25);
        list.add(35);list.add(45);list.add(55);
        list.add(65);list.add(75);list.add(85);
        list.add(90);

        List<String> listStr = new ArrayList<String>();
        listStr.add("a");listStr.add("b");listStr.add("c");
        listStr.add("d");listStr.add("e");listStr.add("f");
        listStr.add("g");

        List<Integer> evenList = list.stream().filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println(evenList);

        List<Integer> updatedValue = list.stream().map(i -> i+1).collect(Collectors.toList());
        System.out.println(updatedValue);

        Long count = list.stream().count();
        Long conditionalCount = list.stream().filter(i -> i>5).count();
        System.out.println("count is "+count);
        System.out.println("conditional count is "+conditionalCount);


        List sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted list is "+sortedList);

//        List sortedListDescendingOrder = list.stream().sorted((i1, i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
        List sortedListDescendingOrder = list.stream().sorted((i1, i2)->-(i1.compareTo(12))).collect(Collectors.toList());
        System.out.println("sorted list is "+sortedListDescendingOrder);

        List sortedString = listStr.stream().sorted().collect(Collectors.toList());
        List sortedStringDescending = listStr.stream().sorted((i1, i2)-> i2.compareTo(i1)).collect(Collectors.toList());
//        List sortedStringDescending = listStr.stream().sorted((i1, i2)-> -i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("sorted list is "+sortedString);
        System.out.println("sorted list is "+sortedStringDescending);

        Integer minimunVal = list.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(minimunVal);

        Integer maxVal= list.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(maxVal);

        Consumer<Integer> consumer = i -> System.out.println("Square is : "+i*i);
        list.stream().forEach(consumer);

        Integer[] integers = list.stream().toArray(Integer[]::new);
        for (Integer integer: integers) {
            System.out.println("Array elements are "+integer);
        }

        //Converting Array to stream
        Stream.of(integers).forEach(System.out::println);

    }
}
