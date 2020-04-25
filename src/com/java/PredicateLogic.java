package com.java;

import java.nio.file.DirectoryStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateLogic {

    public boolean test(Integer integer){
        /*//without lambda
        if(integer %2 ==0){
            return true;
        } else {
            return false;
        }*/

        //with lambda
        //(Integer intgr) -> intgr % 2 == 0;
        Predicate<Integer> predicate = i -> i%2 == 0;
        predicate.test(10);

        Predicate<String> stringPredicate = str -> str.contains("a") && !str.isEmpty() && str.length() >21;
        stringPredicate.test("StringSizeIsAbcdef");

        return integer % 2 == 0;

    }

    public static void main(String[] args) {
        List<Pojo> pojos = new ArrayList<Pojo>();
        pojos.add(new Pojo("a", 100));
        pojos.add(new Pojo("aa", 234));
        pojos.add(new Pojo("b", 435));
        pojos.add(new Pojo("bb", 678));
        pojos.add(new Pojo("g", 989));

        Predicate<Pojo> pojoPredicate = i -> i.name.contains("a") && i.salary >100;
        for (Pojo p : pojos){
            if(pojoPredicate.test(p)){
                System.out.println(p.name);
            }
        }

//        Predicate Joining
        int[] number = {5, 10, 15, 20, 25, 30};
        Predicate<Integer> p1 = i -> i%2==0;
        Predicate<Integer> p2 = i -> i>0;

        for (int demo : number){
            if(p1.and(p2).test(demo)){
                System.out.println(demo);
            }

            if(p1.or(p2).test(demo)){
                System.out.println(demo);
            }

            if(p2.negate().test(demo)){
                System.out.println(demo);
            }
        }
    }
}
