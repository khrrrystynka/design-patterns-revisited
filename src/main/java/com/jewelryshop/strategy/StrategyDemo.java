package com.jewelryshop.strategy;
import java.util.function.Function;

public class StrategyDemo {
    public static void main(String[] args) {
        double price = 1000.0;

        Function<Double, Double> noDiscount = p -> p;
        Function<Double, Double> seasonalDiscount = p -> p * 0.9;
        Function<Double, Double> vipDiscount = p -> p * 0.8;

        System.out.println("No Discount: " + DiscountStrategy.applyDiscount(noDiscount, price));
        System.out.println("Seasonal Discount: " + DiscountStrategy.applyDiscount(seasonalDiscount, price));
        System.out.println("VIP Discount: " + DiscountStrategy.applyDiscount(vipDiscount, price));
    }
}