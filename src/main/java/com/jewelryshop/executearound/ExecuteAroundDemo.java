package com.jewelryshop.executearound;

public class ExecuteAroundDemo {
    public static void run() {
        ExecuteAround.withConnection(conn -> {
            System.out.println("Using connection: " + conn);
            // simulate DB operation
            System.out.println("Saving jewelry item...");
        });
    }
}

