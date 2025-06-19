package com.jewelryshop.factory;

public class FactoryDemo {
    public static void run() {
        Jewelry ring = JewelryFactory.create.apply("ring");
        Jewelry necklace = JewelryFactory.create.apply("necklace");
        System.out.println(ring);
        System.out.println(necklace);
    }
}