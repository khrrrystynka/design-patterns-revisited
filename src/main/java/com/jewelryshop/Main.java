package com.jewelryshop;

import com.jewelryshop.decorator.JewelryService;
import com.jewelryshop.executearound.TransactionManager;
import com.jewelryshop.factory.Jewelry;
import com.jewelryshop.factory.JewelryFactory;
import com.jewelryshop.strategy.DiscountStrategy;
import com.jewelryshop.strategy.PriceCalculator;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Strategy
        DiscountStrategy discount = price -> price * 0.9;
        System.out.println("Discounted price: " + new PriceCalculator().calculate(1000, discount));

        // Factory
        JewelryFactory necklaceFactory = () -> new Jewelry("Necklace", 1500);
        Jewelry necklace = necklaceFactory.create();
        System.out.println("Created: " + necklace);

        // Decorator
        Function<Jewelry, Jewelry> decorated = JewelryService.addEngraving("To my love")
                .andThen(JewelryService.applyLuxuryBox());
        Jewelry gift = decorated.apply(necklace);
        System.out.println("Decorated jewelry: " + gift);

        // Execute Around
        TransactionManager tm = new TransactionManager();
        tm.executeInTransaction(v -> {
            System.out.println("Placing jewelry order...");
            // imagine DB save here
        });
    }
}
