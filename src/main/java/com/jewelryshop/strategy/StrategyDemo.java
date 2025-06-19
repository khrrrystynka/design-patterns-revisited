package com.jewelryshop.strategy;

import java.math.BigDecimal;

public class StrategyDemo {
    public static void run() {
        DiscountStrategy holiday = price -> price.multiply(new BigDecimal("0.8"));
        DiscountStrategy vip = price -> price.multiply(new BigDecimal("0.9"));
        DiscountStrategy noDiscount = price -> price;

        BigDecimal price = new BigDecimal("1000");

        System.out.println("Holiday price: " + holiday.apply(price));
        System.out.println("VIP price: " + vip.apply(price));
        System.out.println("Regular price: " + noDiscount.apply(price));
    }
}