package com.example.designpattern;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * A product can be filtered by color, size or both
 * There can be added more criteria to filler
 */
@RequiredArgsConstructor
@Getter
public class Product {

    private final String productName;
    private final Color color;
    private final Size size;
}
