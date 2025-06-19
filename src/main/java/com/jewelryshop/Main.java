package com.jewelryshop;

import com.jewelryshop.strategy.StrategyDemo;
import com.jewelryshop.factory.FactoryDemo;
import com.jewelryshop.decorator.DecoratorDemo;
import com.jewelryshop.executearound.ExecuteAroundDemo;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Strategy Pattern ===");
        StrategyDemo.run();

        System.out.println("\n=== Factory Method ===");
        FactoryDemo.run();

        System.out.println("\n=== Decorator ===");
        DecoratorDemo.run();

        System.out.println("\n=== Execute Around ===");
        ExecuteAroundDemo.run();
    }
}