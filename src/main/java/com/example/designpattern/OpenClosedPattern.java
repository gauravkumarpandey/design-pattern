package com.example.designpattern;

import java.util.Arrays;
import java.util.List;

public class OpenClosedPattern {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Apple", Color.GREEN, Size.SMALL), new Product("Tree", Color.GREEN, Size.LARGE),
                new Product("House", Color.BLUE, Size.HUGE));

        System.out.println("Filer product by color(old): ");
        ProductFilter productFilter = new ProductFilter();
        productFilter.filterPrductByColor(products, Color.GREEN)
                .forEach(p -> System.out.println(" - " + p.getProductName() + " is green"));

        System.out.println("Filer product by color(new): ");
        BetterFilter betterFilter = new BetterFilter();
        betterFilter.filler(products, new ColorSpecification(Color.GREEN))
                .forEach(p -> System.out.println(" - " + p.getProductName() + " is green"));

        System.out.println("Filer product by size(new): ");
        betterFilter.filler(products, new SizeSpecifcation(Size.HUGE))
                .forEach(p -> System.out.println(" - " + p.getProductName() + " is huge size"));

        betterFilter.filler(products, new AndSpecification<>(new ColorSpecification(Color.BLUE),
                new SizeSpecifcation(Size.HUGE)))
                .forEach(p -> System.out.println(p.getProductName()));
        ;

    }
}
