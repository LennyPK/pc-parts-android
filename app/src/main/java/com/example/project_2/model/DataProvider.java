package com.example.project_2.model;

import android.content.Context;
import android.util.Log;

import com.example.project_2.model.Item;
import com.example.project_2.model.Category;

import java.util.*;

public class DataProvider {
    private static Category motherboard = new Category("Motherboard", 1);
    private static Category ram = new Category("RAM", 2);
    private static Category gpu = new Category("GPU", 3);

    static Item[] allItems = {new Item(motherboard, "ASUS TUF Gaming X570-PLUS (WI-FI) ATX", 3, "it works", 999.99),
                              new Item(motherboard, "ASUS ROG STRIX X570-E Gaming ATX", 1, "this also works", 111.99)};

    public static ArrayList<Item> getProducts() {
        ArrayList<Item> products = new ArrayList<Item>();
        int i = 0;
        for (Item name : allItems) {
            products.set(i, allItems[i]);
            i++;
        }
        Collections.shuffle(products);

        return products;
    }

    public static ArrayList<Item> getMotherboards() {
        // two motherboards in the database
        ArrayList<Item> products = new ArrayList<Item>();
        for (int i= 0; i < 2; i++) {
            products.set(i, allItems[i]);
            i++;
        }
        Collections.shuffle(products);

        return products;
    }

    public static ArrayList<Item> getRAM() {
        ArrayList<Item> products = new ArrayList<Item>();
        for (int i= 0; i < 2; i++) {
            products.set(i, allItems[i]);
            i++;
        }
        Collections.shuffle(products);

        return products;
    }

    public static ArrayList<Item> getGPU() {
        ArrayList<Item> products = new ArrayList<Item>();
        for (int i= 0; i < 2; i++) {
            products.set(i, allItems[i]);
            i++;
        }
        Collections.shuffle(products);

        return products;
    }

}
