package com.example.project_2.model;

import android.content.Context;
import android.util.Log;

import com.example.project_2.R;
import com.example.project_2.model.Item;
import com.example.project_2.model.Category;

import java.util.*;

public class DataProvider {

    static String[] category = {"Motherboard", "Motherboard", "Motherboard",
                                "RAM", "RAM","RAM",
                                "GPU", "GPU","GPU"};

    //Any categories created here will show up in the main screen
    public static Category CATEGORY_MOTHERBOARD = new Category("Motherboard", R.drawable.motherboard);
    public static Category CATEGORY_RAM = new Category("RAM", R.drawable.ram);
    public static Category CATEGORY_GPU = new Category("GPU", R.drawable.gpu);

//     static Item[] allItems;

     public DataProvider(){
         //Item titles must be unique otherwise only first one will be added
         Item.addItem(new Item(CATEGORY_MOTHERBOARD, "ASUS TUF Gaming X570-PLUS (WI-FI) ATX", R.drawable.motherboard, "it works", 999.99, 1));
         Item.addItem(new Item(CATEGORY_MOTHERBOARD, "ASUS ROG STRIX X570-E Gaming ATX 1", R.drawable.motherboard, "this also works", 111.99,1));
         Item.addItem(new Item(CATEGORY_MOTHERBOARD, "ASUS ROG STRIX X570-E Gaming ATX 2", R.drawable.motherboard, "this also works", 111.99,1));
         Item.addItem(new Item(CATEGORY_MOTHERBOARD, "ASUS ROG STRIX X570-E Gaming ATX 3", R.drawable.motherboard, "this also works", 111.99,1));
         Item.addItem(new Item(CATEGORY_MOTHERBOARD, "ASUS ROG STRIX X570-E Gaming ATX 4", R.drawable.motherboard, "this also works", 111.99,1));
     }


    static String[] name = {"ASUS TUF Gaming X570-PLUS (WI-FI) ATX", "ASUS ROG STRIX X570-E Gaming ATX", "ASUS PRIME X570-P/CSM ATX",
                            "HyperX Fury 32GB RAM (2 x 16GB) DDR4-3200MHz", "G.SKILL Trident Z RGB F4-3200C16D-16GTZR 16GB RAM (2 x 8GB) DDR4 3200Mhz",
                            "G.SKILL Trident Z Neo RGB F4-3600C18D-16GTZN 16 GB RAM (2X 8GB) DDR4 3600MHz",
                            "ASUS ROG STRIX Geforce RTX 3060", "Powercolor Red Devil AMD Radeon RX 6700 XT", "Sapphire NITRO+ Radeon RX 6700 XT"};

    static int[] mainImage = {R.drawable.mb1_1, R.drawable.mb2_1, R.drawable.mb3_1,
                              R.drawable.ram1_1, R.drawable.ram2_1, R.drawable.ram3_1,
                              R.drawable.gpu1_1, R.drawable.gpu2_1, R.drawable.gpu3_1};

    static int[][] images = {{R.drawable.mb1_1, R.drawable.mb1_2, R.drawable.mb1_3, R.drawable.mb1_4},
                             {R.drawable.mb2_1, R.drawable.mb2_2, R.drawable.mb2_3, R.drawable.mb2_4},
                             {R.drawable.mb3_1, R.drawable.mb3_2, R.drawable.mb3_3, R.drawable.mb3_4},

                             {R.drawable.ram1_1, R.drawable.ram1_2, R.drawable.ram1_3, R.drawable.ram1_4},
                             {R.drawable.ram2_1, R.drawable.ram2_2, R.drawable.ram2_3, R.drawable.ram2_4},
                             {R.drawable.ram3_1, R.drawable.ram3_2, R.drawable.ram3_3, R.drawable.ram3_4},

                             {R.drawable.gpu1_1, R.drawable.gpu1_2, R.drawable.gpu1_3, R.drawable.gpu1_4},
                             {R.drawable.gpu2_1, R.drawable.gpu2_2, R.drawable.gpu2_3, R.drawable.gpu2_4},
                             {R.drawable.gpu3_1, R.drawable.gpu3_2, R.drawable.gpu3_3, R.drawable.gpu3_4}
    };

    static String[] description = {
            "AMD AM4\n" + "Yes\n" + "X570\n" + "ATX\n" + "DDR4\n",
            "AMD AM4\n" + "Yes\n" + "X570\n" + "ATX\n" + "DDR4\n",
            "AMD AM4\n" + "No\n" + "X570\n" + "ATX\n" + "DDR4\n",

            "DIMM\n" + "DDR4\n" + "32GB (2 x 16GB)\n" + "3200Mhz\n" + "CL16\n" + "1.35 Volts\n",
            "DDR4\n" + "DIMM\n" + "16GB (2 x 8GB)\n" + "3200Mhz\n" + "CL16\n" + "1.35 Volts\n",
            "DDR4\n" + "DIMM\n" + "16GB (2 x 8GB)\n" + "3600Mhz\n" + "CL18\n" + "1.35 Volts\n",

            "RTX 3060\n" + "12GB\n" + "4\n" + "300mm\n" + "3\n",
            "RX 6700 XT\n" + "12GB\n" + "4\n" + "320mm\n" + "3\n",
            "RX 6700 XT\n" + "12GB\n" + "4\n" + "310mm\n" + "3\n"
    };

    static double[] price = {365.00, 484.99, 270.00,
                             309.99, 214.99, 249.00,
                             1268.99, 1498.99, 1498.99};

//    static Item[] allItems = {new Item(Category.getCategory("Motherboard"), "ASUS TUF Gaming X570-PLUS (WI-FI) ATX", 3, "it works", 365.00),
//                              new Item(Category.getCategory("Motherboard"), "ASUS ROG STRIX X570-E Gaming ATX", 1, "this also works", 111.99),
//                              new Item(Category.getCategory("Motherboard"), "ASUS PRIME X570-P/CSM ATX", 1, "this also works!!", 111.99)
//    };

    public static ArrayList<Item> getProducts() {
        ArrayList<Item> products = new ArrayList<Item>();
        int i = 0;
        for (String index : category) {
            products.set(i, new Item(Category.getCategory(index), name[i], mainImage[i], description[i], price[i],1));
            i++;
        }
        return products;
    }

    public static ArrayList<Item> getCategory(String specificCategory) {
        ArrayList<Item> products = new ArrayList<Item>();
        int i = 0;
        int productsIndex = 0;
        specificCategory = specificCategory.toLowerCase();
        for (String index : category) {
            index = index.toLowerCase();
            if (index == specificCategory) {
                products.set(productsIndex, new Item(Category.getCategory(category[i]), name[i], mainImage[i], description[i], price[i],1));
                productsIndex++;
            }
            i++;
        }
        return products;
    }

    public static ArrayList<Item> searchResults(String search) {
        ArrayList<Item> products = new ArrayList<Item>();
        int i = 0;
        int productsIndex = 0;
        search = search.toLowerCase();
        for (String index : category) {
            /* contains is case sensitive */
            String nameLower = name[i].toLowerCase();
            index = index.toLowerCase();
            if (index.contains(search) || nameLower.contains(search)) {
                products.set(productsIndex, new Item(Category.getCategory(category[i]), name[i], mainImage[i], description[i], price[i],1));
                productsIndex++;
            }
            i++;
        }
        return products;
    }

}
