package com.example.designpattern;

import java.util.List;
import java.util.stream.Stream;

@BrokenPattern(patternName = "Open-Closed", description = """
         The class is open for modifications if the requirement changes to filter 
          the product with more criteria ( by size and color)
        """)
public class ProductFilter {

    public Stream<Product> filterPrductByColor(List<Product> products, Color color){
        return products.stream().filter(p -> p.getColor() == color);
    }

    public Stream<Product> filterPrductBySize(List<Product> products, Size size){
        return products.stream().filter(p -> p.getSize() == size);
    }
}
