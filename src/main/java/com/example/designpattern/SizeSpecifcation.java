package com.example.designpattern;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SizeSpecifcation implements Specification<Product>{

    private final Size size;

    @Override
    public boolean isSatisfied(Product item) {
       return item.getSize() == size;
    }
 
}
