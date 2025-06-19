package com.jewelryshop.executearound;

import java.util.function.Consumer;

public class ExecuteAround {
    public static void withConnection(Consumer<String> action) {
        String connection = "MockDatabaseConnection";
        System.out.println("Opening connection...");
        try {
            action.accept(connection);
        } finally {
            System.out.println("Closing connection...");
        }
    }
}