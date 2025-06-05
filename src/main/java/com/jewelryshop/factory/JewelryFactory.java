package com.jewelryshop.factory;

import java.util.function.Supplier;

public class JewelryFactory {
    public static <T> T create(Supplier<T> supplier) {
        return supplier.get();
    }
}
