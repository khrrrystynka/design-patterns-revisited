package com.jewelryshop.decorator;

import com.jewelryshop.factory.Jewelry;

import java.util.function.Function;

public class JewelryService {

    public static Function<Jewelry, Jewelry> addEngraving(String message) {
        return jewelry -> new Jewelry(jewelry.type() + " with engraving '" + message + "'", jewelry.price() + 50);
    }

    public static Function<Jewelry, Jewelry> applyLuxuryBox() {
        return jewelry -> new Jewelry(jewelry.type() + " in luxury box", jewelry.price() + 100);
    }
}
