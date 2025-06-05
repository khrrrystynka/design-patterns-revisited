package com.jewelryshop.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Jewelry baseRing = new BaseRing();
        Jewelry engravedRing = EngravingDecorator.withEngraving(baseRing, "Love Forever");

        System.out.println(engravedRing.description());
    }
}
