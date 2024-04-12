package com.example.designpattern;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AndSpecification<T> implements Specification<T>{

    private final Specification<T> left, right;
    @Override
    public boolean isSatisfied(T item) {
      return left.isSatisfied(item) && right.isSatisfied(item);
    }
}
