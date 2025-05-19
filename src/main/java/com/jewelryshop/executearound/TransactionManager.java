package com.jewelryshop.executearound;

import java.util.function.Consumer;

public class TransactionManager {

    public void executeInTransaction(Consumer<Void> operation) {
        begin();
        try {
            operation.accept(null);
            commit();
        } catch (Exception e) {
            rollback();
        }
    }

    private void begin() {
        System.out.println("Transaction started");
    }

    private void commit() {
        System.out.println("Transaction committed");
    }

    private void rollback() {
        System.out.println("Transaction rolled back");
    }
}
