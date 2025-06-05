package com.jewelryshop.executearound;

public class ExecuteAroundDemo {
    public static void main(String[] args) {
        String result = JewelryFileProcessor.processFile("jewelry.txt", reader -> {
            try {
                return reader.readLine();
            } catch (Exception e) {
                return "Error reading file";
            }
        });

        System.out.println("First line: " + result);
    }
}
