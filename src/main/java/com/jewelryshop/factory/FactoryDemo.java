package com.jewelryshop.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        var ring = JewelryFactory.create(() -> new Ring("Gold", 17.5));
        var necklace = JewelryFactory.create(() -> new Necklace("Silver", 45));

        System.out.println(ring);
        System.out.println(necklace);
    }
}
