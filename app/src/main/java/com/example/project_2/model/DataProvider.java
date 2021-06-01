package com.example.project_2.model;

import android.content.Context;
import android.util.Log;

import com.example.project_2.R;
import com.example.project_2.model.Item;
import com.example.project_2.model.Category;

import java.util.*;

public class DataProvider {

    static String[] category = {"motherboard", "motherboard", "motherboard",
                                "ram", "ram","ram",
                                "gpu", "gpu","gpu"};

    //Any categories created here will show up in the main screen
    public static Category CATEGORY_MOTHERBOARD = new Category("Motherboard", R.drawable.motherboard);
    public static Category CATEGORY_RAM = new Category("RAM", R.drawable.ram);
    public static Category CATEGORY_GPU = new Category("GPU", R.drawable.gpu);

//     static Item[] allItems;

//     public DataProvider(){
//         Item.addItem(new Item(CATEGORY_MOTHERBOARD, "ASUS TUF Gaming X570-PLUS (WI-FI) ATX", R.drawable.motherboard, "it works", 999.99));
//         Item.addItem(new Item(CATEGORY_MOTHERBOARD, "ASUS ROG STRIX X570-E Gaming ATX", R.drawable.motherboard, "this also works", 111.99));
//         Item.addItem(new Item(CATEGORY_MOTHERBOARD, "ASUS ROG STRIX X570-E Gaming ATX", R.drawable.motherboard, "this also works", 111.99));
//         Item.addItem(new Item(CATEGORY_MOTHERBOARD, "ASUS ROG STRIX X570-E Gaming ATX", R.drawable.motherboard, "this also works", 111.99));
//         Item.addItem(new Item(CATEGORY_MOTHERBOARD, "ASUS ROG STRIX X570-E Gaming ATX", R.drawable.motherboard, "this also works", 111.99));
//         System.out.println(Item.items.size());
//         for(int i = 0; i < Item.items.size();i++){
//             System.out.println(Item.getItem(i).getTitle());
//         }
//         System.out.println("HELLO!!");
//     }


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
            "MB Socket\t\tAMD AM4\n" + "Wi-Fi\t\t\tYes\n" + "Chipset\t\t\tX570\n" +
                    "Form Factor\t\tATX\n" + "Memory Type\t\tDDR4\n",
            "MB Socket\t\tAMD AM4\n" + "Wi-Fi\t\t\tYes\n" + "Chipset\t\t\tX570\n" +
                    "Form Factor\t\tATX\n" + "Memory Type\t\tDDR4\n",
            "MB Socket\t\tAMD AM4\n" + "Wi-Fi\t\t\tNo\n" + "Chipset\t\t\tX570\n" +
                    "Form Factor\t\tATX\n" + "Memory Type\t\tDDR4\n",

            "Form Factor\t\tDIMM\n" + "Memory Type\t\tDDR4\n" + "Memory Capacity\t32GB (2 x 16GB)\n" +
                    "Memory Speed\t\t3200Mhz\n" + "CAS Latency\t\tCL16\n" + "Voltage\t\t\t1.35 Volts\n",
            "Form Factor\t\tDDR4\n" + "Memory Type\t\tDIMM\n" + "Memory Capacity\t16GB (2 x 8GB)\n" +
                    "Memory Speed\t\t3200Mhz\n" + "CAS Latency\t\tCL16\n" + "Voltage\t\t\t1.35 Volts\n",
            "Form Factor\t\tDDR4\n" + "Memory Type\t\tDIMM\n" + "Memory Capacity\t16GB (2 x 8GB)\n" +
                    "Memory Speed\t\t3600Mhz\n" + "CAS Latency\t\tCL18\n" + "Voltage\t\t\t1.35 Volts\n",

            "Product Model\t\tRTX 3060\n" + "Memory Size\t\t12GB\n" + "Max Displays\t\t4\n" +
                    "Length\t\t\t300mm\n" + "Display Ports\t\t3\n",
            "Product Model\t\tRX 6700 XT\n" + "Memory Size\t\t12GB\n" + "Max Displays\t\t4\n" +
                    "Length\t\t\t320mm\n" + "Display Ports\t\t3\n",
            "Product Model\t\tRX 6700 XT\n" + "Memory Size\t\t12GB\n" + "Max Displays\t\t4\n" +
                    "Length\t\t\t310mm\n" + "Display Ports\t\t3\n"
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
            products.set(i, new Item(Category.getCategory("Motherboard"), name[i], mainImage[i], description[i], price[i]));
            i++;
        }
        return products;
    }

    public static ArrayList<Item> getCategory(String specificCategory) {
        ArrayList<Item> products = new ArrayList<Item>();
        int i = 0;
        for (String index : category) {
            if (index == specificCategory) {
                products.set(i, new Item(Category.getCategory(specificCategory), name[i], mainImage[i], description[i], price[i]));
                i++;
            }
        }
        return products;
    }

}
