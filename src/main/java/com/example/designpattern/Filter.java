package com.example.designpattern;

import java.util.List;
import java.util.stream.Stream;

public interface Filter<T> {
   Stream<T> filler(List<T> items, Specification<T> spec);
}
