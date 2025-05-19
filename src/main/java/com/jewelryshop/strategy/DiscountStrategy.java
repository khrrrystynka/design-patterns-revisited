package com.jewelryshop.strategy;

@FunctionalInterface
public interface DiscountStrategy {
    double applyDiscount(double price);
}
