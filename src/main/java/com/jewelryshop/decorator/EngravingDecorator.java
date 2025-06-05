package com.jewelryshop.decorator;

import java.util.function.Function;

public class EngravingDecorator {
    public static Jewelry withEngraving(Jewelry base, String engravingText) {
        return () -> base.description() + " with engraving: '" + engravingText + "'";
    }
}
