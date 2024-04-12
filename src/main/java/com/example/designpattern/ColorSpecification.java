package com.example.designpattern;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ColorSpecification implements Specification<Product>{

    private final Color color;

    @Override
    public boolean isSatisfied(Product item) {
        return item.getColor() == color;
    }
}
