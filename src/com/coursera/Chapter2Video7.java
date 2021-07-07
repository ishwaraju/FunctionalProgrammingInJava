package com.coursera;

/**
 * @author ishwaraju
 */

public class Chapter2Video7 {

    public static void main(String[] args) {
        NoArgFunction<NoArgFunction<String>> createGreeter = () -> {
            String name = "Ishwar Kumar";
            return () -> "Hello, " + name;
        };

        NoArgFunction<String> greeter = createGreeter.apply();
        System.out.println(greeter.apply());
    }
}
