package com.coursera;

/**
 * @author ishwaraju
 */

public interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}
