package com.example.designpattern;

import java.util.List;
import java.util.stream.Stream;

/**
 * Fix the issues of Open closed principal by 
 * adding specificcations, so once shipped in production
 *  this class will be closed for modifications however 
 *   more specification can be added
 * 
 * @see ProductFilter
 */
@ConfirPattern(patternName = "Open Close principal")
public class BetterFilter implements Filter<Product>{

    @Override
    public Stream<Product> filler(List<Product> products, Specification<Product> spec) {
       return products.stream().filter(p -> spec.isSatisfied(p));
    }
    
}
