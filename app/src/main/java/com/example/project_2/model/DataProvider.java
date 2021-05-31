package com.example.project_2.model;

import android.content.Context;
import android.util.Log;

import com.example.project_2.R;
import com.example.project_2.model.Item;
import com.example.project_2.model.Category;

import java.util.*;

public class DataProvider {

    static String[] category = {"motherboard", "motherboard", "motherboard"};

    static String[] name = {"ASUS TUF Gaming X570-PLUS (WI-FI) ATX", "ASUS ROG STRIX X570-E Gaming ATX", "ASUS PRIME X570-P/CSM ATX"};

    static int[] mainImage = {R.drawable.asus1_1, R.drawable.asus2_1, R.drawable.asus3_1};

    static int[][] images = {{R.drawable.asus1_1, R.drawable.asus1_2, R.drawable.asus1_3, R.drawable.asus1_4},
                             {R.drawable.asus2_1, R.drawable.asus2_2, R.drawable.asus2_3, R.drawable.asus2_4},
                             {R.drawable.asus3_1, R.drawable.asus3_2, R.drawable.asus3_3, R.drawable.asus3_4},
    };

    static String[] description = {"MB Socket\t\tAMD AM4\n" + "Wi-Fi\t\t\tYes\n" + "Chipset\t\t\tX570\n" + "Form Factor\t\tATX\n" + "Memory Type\t\tDDR4\n",
                                   "MB Socket\t\tAMD AM4\n" + "Wi-Fi\t\t\tYes\n" + "Chipset\t\t\tX570\n" + "Form Factor\t\tATX\n" + "Memory Type\t\tDDR4\n",
                                   "MB Socket\t\tAMD AM4\n" + "Wi-Fi\t\t\tNo\n" + "Chipset\t\t\tX570\n" + "Form Factor\t\tATX\n" + "Memory Type\t\tDDR4\n"
    };

    static double[] price = {365.00, 484.99, 270.00};

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
            if (category[i] == specificCategory) {
                products.set(i, new Item(Category.getCategory(specificCategory), name[i], mainImage[i], description[i], price[i]));
            }
            i++;
        }
        return products;
    }

}
