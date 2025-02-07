package com.lab;

public class App {
    public static void main(String[] args) {
        Inventory<String> bookInventory = new Inventory<>();
        bookInventory.add("Java Programming");
        bookInventory.add("Data Structures");
        bookInventory.add("Java Programming"); // duplicate, should not be added

        System.out.println(bookInventory.getAll());

        int count = DataProcessor.countItems(bookInventory.getAll());
        System.out.println("Total unique items: " + count);
    }
}
