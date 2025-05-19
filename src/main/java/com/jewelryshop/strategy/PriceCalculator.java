package com.jewelryshop.strategy;

public class PriceCalculator {
    public double calculate(double price, DiscountStrategy strategy) {
        return strategy.applyDiscount(price);
    }
}
