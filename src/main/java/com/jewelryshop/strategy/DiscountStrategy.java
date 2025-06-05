package com.jewelryshop.strategy;

import java.util.function.Function;

public class DiscountStrategy {
    public static double applyDiscount(Function<Double, Double> strategy, double price) {
        return strategy.apply(price);
    }
}

