package com.jewelryshop.decorator;

public class BaseRing implements Jewelry {
    @Override
    public String description() {
        return "Gold ring";
    }
}