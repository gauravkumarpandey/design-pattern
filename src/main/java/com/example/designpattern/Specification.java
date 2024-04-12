package com.example.designpattern;

/**
 * This is open for extension
 */
public interface Specification<T> {
    boolean isSatisfied(T item);
}
