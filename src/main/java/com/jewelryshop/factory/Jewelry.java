package com.jewelryshop.factory;

public record Jewelry(String type, String material) {
    @Override
    public String toString() {
        return type + " made of " + material;
    }
}
