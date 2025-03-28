package com.bridgelabz.SmartWarehouse.src;



public class WarehouseSystem {
    public static void main(String[] args) {
        // Create storage for different item types
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        // Add items to storage with cost attribute
        electronicsStorage.addItem(new Electronics("Laptop", 1200.50, 2));
        electronicsStorage.addItem(new Electronics("Television", 799.99, 3));

        groceriesStorage.addItem(new Groceries("Apple", 2.50, "2025-01-10"));
        groceriesStorage.addItem(new Groceries("Milk", 3.99, "2024-04-15"));

        furnitureStorage.addItem(new Furniture("Sofas", 150.00, "Leather"));
        furnitureStorage.addItem(new Furniture("Table", 300.75, "Metal"));

        // Display all items using wildcard method
        System.out.println("--------Electronics Storage ---------");
        Storage.displayItems(electronicsStorage.getItems());

        System.out.println("\n--------- Groceries Storage ------------");
        Storage.displayItems(groceriesStorage.getItems());

        System.out.println("\n-------- Furniture Storage --------------");
        Storage.displayItems(furnitureStorage.getItems());
    }
}

