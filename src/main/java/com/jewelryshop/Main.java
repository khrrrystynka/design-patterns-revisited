package com.jewelryshop;

import com.jewelryshop.strategy.DiscountStrategy;
import com.jewelryshop.factory.*;
import com.jewelryshop.decorator.*;
import com.jewelryshop.executearound.JewelryFileProcessor;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Jewelry Shop Functional Patterns Demo ===");

        // --- Strategy Pattern ---
        double price = 1500.0;
        Function<Double, Double> seasonalDiscount = p -> p * 0.9;
        double discountedPrice = DiscountStrategy.applyDiscount(seasonalDiscount, price);
        System.out.println("\n[Strategy] Seasonal discount on " + price + " = " + discountedPrice);

        // --- Factory Method Pattern ---
        Supplier<Ring> ringSupplier = () -> new Ring("Gold", 18.0);
        Supplier<Necklace> necklaceSupplier = () -> new Necklace("Platinum", 50);
        Ring ring = JewelryFactory.create(ringSupplier);
        Necklace necklace = JewelryFactory.create(necklaceSupplier);
        System.out.println("\n[Factory Method] Created ring: " + ring);
        System.out.println("[Factory Method] Created necklace: " + necklace);

        // --- Decorator Pattern ---
        Jewelry baseRing = new BaseRing();
        Jewelry engravedRing = EngravingDecorator.withEngraving(baseRing, "Forever Yours");
        System.out.println("\n[Decorator] " + engravedRing.description());

        // --- Execute Around Pattern ---
        String firstLine = JewelryFileProcessor.processFile("jewelry.txt", reader -> {
            try {
                return reader.readLine();
            } catch (Exception e) {
                return "Could not read file.";
            }
        });
        System.out.println("\n[Execute Around] First line of 'jewelry.txt': " + firstLine);
    }
}
