package com.jewelryshop.decorator;

import com.jewelryshop.factory.Jewelry;

import java.util.function.Function;

public class DecoratorDemo {
    public static void run() {
        Jewelry baseJewelry = new Jewelry("Ring", "Gold");

        Function<Jewelry, Jewelry> withEngraving = jewelry ->
                new Jewelry(jewelry.type() + " + Engraving", jewelry.material());
        Function<Jewelry, Jewelry> withGiftWrap = jewelry ->
                new Jewelry(jewelry.type() + " + GiftWrap", jewelry.material());

        Jewelry finalProduct = withEngraving.andThen(withGiftWrap).apply(baseJewelry);

        System.out.println("Decorated: " + finalProduct);
    }
}
