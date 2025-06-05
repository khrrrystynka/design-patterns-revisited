package com.jewelryshop.executearound;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Function;

public class JewelryFileProcessor {
    public static <R> R processFile(String path, Function<BufferedReader, R> processor) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            return processor.apply(reader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
