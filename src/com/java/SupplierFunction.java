package com.java;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierFunction {

    public static void main(String[] args) {
        Supplier<Date> dateSupplier = () -> new Date();
        System.out.println(dateSupplier.get());

        Supplier<String> otp = () -> {
            String str = "";
            for (int i=0;i<6;i++){
            str = str+(int)(Math.random()*10);
            }
            return str;
        };

        System.out.println(otp.get());
        System.out.println(otp.get());
        System.out.println(otp.get());
        System.out.println(otp.get());
        System.out.println(otp.get());
    }
}
