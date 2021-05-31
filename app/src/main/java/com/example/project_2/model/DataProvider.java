package com.example.project_2.model;

import android.content.Context;
import android.util.Log;

import com.example.project_2.R;
import com.example.project_2.model.Item;
import com.example.project_2.model.Category;

import java.util.*;

public class DataProvider {
    //Any categories created here will show up in the main screen
    public static Category CATEGORY_MOTHERBOARD = new Category("Motherboard", R.drawable.motherboard);
    public static Category CATEGORY_RAM = new Category("RAM", R.drawable.ram);
    public static Category CATEGORY_GPU = new Category("GPU", R.drawable.gpu);

    static Item[] allItems;

    public DataProvider(){
        Item.addItem(new Item(CATEGORY_MOTHERBOARD, "ASUS TUF Gaming X570-PLUS (WI-FI) ATX", R.drawable.motherboard, "it works", 999.99));
        Item.addItem(new Item(CATEGORY_MOTHERBOARD, "ASUS ROG STRIX X570-E Gaming ATX", R.drawable.motherboard, "this also works", 111.99));
        Item.addItem(new Item(CATEGORY_MOTHERBOARD, "ASUS ROG STRIX X570-E Gaming ATX", R.drawable.motherboard, "this also works", 111.99));
        Item.addItem(new Item(CATEGORY_MOTHERBOARD, "ASUS ROG STRIX X570-E Gaming ATX", R.drawable.motherboard, "this also works", 111.99));
        Item.addItem(new Item(CATEGORY_MOTHERBOARD, "ASUS ROG STRIX X570-E Gaming ATX", R.drawable.motherboard, "this also works", 111.99));
        System.out.println(Item.items.size());
        for(int i = 0; i < Item.items.size();i++){
            System.out.println(Item.getItem(i).getTitle());
        }
        System.out.println("HELLO!!");
    }

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
