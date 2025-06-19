package com.jewelryshop.factory;

import java.util.function.Function;

public class JewelryFactory {
    public static final Function<String, Jewelry> create = type -> switch (type.toLowerCase()) {
        case "ring" -> new Jewelry("Ring", "Gold");
        case "necklace" -> new Jewelry("Necklace", "Silver");
        default -> new Jewelry("Unknown", "Metal");
    };
}
