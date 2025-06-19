package com.jewelryshop.strategy;

import java.math.BigDecimal;

@FunctionalInterface
public interface DiscountStrategy {
    BigDecimal apply(BigDecimal price);
}
