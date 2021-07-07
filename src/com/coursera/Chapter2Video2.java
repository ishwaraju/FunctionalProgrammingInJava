package com.coursera;

import java.util.function.Function;

/**
 * @author ishwaraju
 */

public class Chapter2Video2 {

    public static void main(String[] args) {
        Function<Integer, Integer> absoluteValue = (x) -> {
            if (x < 0) {
                return -x;
            } else {
                return x;
            }
        };

        System.out.println(absoluteValue.apply(-100));
    }
}
