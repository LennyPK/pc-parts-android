package com.example.project_2.model;

import com.example.project_2.R;

import java.util.*;

public class DataProvider {
    //Any categories created here will show up on the main screen
    public static Category CATEGORY_MOTHERBOARD = new Category("Motherboard", R.drawable.category_motherboard, "MB Socket:\nWi-Fi:\nChipset:\nForm Factor:\nMemory Type:");
    public static Category CATEGORY_RAM = new Category("RAM", R.drawable.category_ram, "Form Factor:\nMemory Type:\nMemory Capacity:\nMemory Speed:\nCAS Latency:\nVoltage:");
    public static Category CATEGORY_GPU = new Category("GPU", R.drawable.category_gpu,"Product Model:\nMemory Size:\nMax Displays:\nLength:\nDisplay Ports:");

    static Category[] category = {
            CATEGORY_MOTHERBOARD, CATEGORY_MOTHERBOARD, CATEGORY_MOTHERBOARD, CATEGORY_MOTHERBOARD,
            CATEGORY_MOTHERBOARD, CATEGORY_MOTHERBOARD, CATEGORY_MOTHERBOARD, CATEGORY_MOTHERBOARD,
            CATEGORY_MOTHERBOARD, CATEGORY_MOTHERBOARD,

            CATEGORY_RAM, CATEGORY_RAM, CATEGORY_RAM, CATEGORY_RAM, CATEGORY_RAM, CATEGORY_RAM,
            CATEGORY_RAM, CATEGORY_RAM, CATEGORY_RAM, CATEGORY_RAM,

            CATEGORY_GPU, CATEGORY_GPU, CATEGORY_GPU, CATEGORY_GPU, CATEGORY_GPU, CATEGORY_GPU,
            CATEGORY_GPU, CATEGORY_GPU, CATEGORY_GPU, CATEGORY_GPU
    };


    static String[] name = {
            "ASUS TUF Gaming X570-PLUS (WI-FI) ATX",
            "ASUS ROG STRIX X570-E Gaming ATX",
            "ASUS PRIME X570-P/CSM ATX",
            "ASUS TUF GAMING B550-PLUS ATX",
            "Gigabyte A520I AC ITX",
            "ASUS ROG STRIX B550-I GAMING ITX",
            "ASUS PRIME A520M-E MATX",
            "ASUS ROG STRIX B550-F GAMING (WI-FI) ATX",
            "ASRock B450M Steel Legend mATX",
            "Gigabyte X570 AORUS ELITE WIFI ATX",

            "HyperX Fury 32GB RAM (2 x 16GB) DDR4-3200MHz",
            "G.SKILL Trident Z RGB F4-3200C16D-16GTZR 16GB RAM (2 x 8GB) DDR4 3200Mhz",
            "G.SKILL Trident Z Neo RGB F4-3600C18D-16GTZN 16 GB RAM (2X 8GB) DDR4 3600MHz",
            "G.SKILL Trident Z RGB F4-3200C16D-32GTZR 32GB RAM (2 x 16GB) DDR4 3200Mhz",
            "Corsair Vengeance RGB Pro SL White 32GB RAM 2 X 16GB, DDR4 3600MHz",
            "Crucial Ballistix 16GB Kit (8GBx2) White DDR4",
            "G.SKILL Trident Z Royal RGB F4-3200C16D-16GTRS 16GB RAM (2 x 8GB) DDR4 3200Mhz",
            "HyperX Fury 32GB RAM (2 x 16GB) DDR4-3600MHz",
            "Corsair Vengeance RGB Pro SL Black 32GB RAM 2 X 16GB, DDR4, 3600MHz",
            "HyperX Predator 16GB (2x8GB) DDR4-5000",

            "ASUS ROG STRIX Geforce RTX 3060",
            "Powercolor Red Devil AMD Radeon RX 6700 XT",
            "Sapphire NITRO+ Radeon RX 6700 XT",
            "ASRock AMD Radeon Challenge Pro 12G OC RX 6700 XT",
            "Gigabyte Radeon RX 6900 XT Gaming OC",
            "Powercolor Red Devil AMD Radeon RX 6900 XT",
            "Gigabyte Radeon RX 6700 XT Gaming OC",
            "Sapphire Nitro+ AMD Radeon RX 6900 XT SE Gaming OC",
            "ASUS ROG STRIX Geforce RTX 3070",
            "Gigabyte GeForce RTX 3090 GAMING OC"
    };

    static int[] mainImage = {
            R.drawable.mb1_1, R.drawable.mb2_1, R.drawable.mb3_1,
            R.drawable.mb4_1, R.drawable.mb5_1, R.drawable.mb6_1,
            R.drawable.mb7_1, R.drawable.mb8_1, R.drawable.mb9_1,
            R.drawable.mb10_1,

            R.drawable.ram1_1, R.drawable.ram2_1, R.drawable.ram3_1,
            R.drawable.ram4_1, R.drawable.ram5_1, R.drawable.ram6_1,
            R.drawable.ram7_1, R.drawable.ram8_1, R.drawable.ram9_1,
            R.drawable.ram10_1,

            R.drawable.gpu1_1, R.drawable.gpu2_1, R.drawable.gpu3_1,
            R.drawable.gpu4_1, R.drawable.gpu5_1, R.drawable.gpu6_1,
            R.drawable.gpu7_1, R.drawable.gpu8_1, R.drawable.gpu9_1,
            R.drawable.gpu10_1
    };

    static int[][] images = {
            {R.drawable.mb1_1, R.drawable.mb1_2, R.drawable.mb1_3, R.drawable.mb1_4},
            {R.drawable.mb2_1, R.drawable.mb2_2, R.drawable.mb2_3, R.drawable.mb2_4},
            {R.drawable.mb3_1, R.drawable.mb3_2, R.drawable.mb3_3, R.drawable.mb3_4},
            {R.drawable.mb4_1, R.drawable.mb4_2, R.drawable.mb4_3, R.drawable.mb4_4},
            {R.drawable.mb5_1, R.drawable.mb5_2, R.drawable.mb5_3, R.drawable.mb5_4},
            {R.drawable.mb6_1, R.drawable.mb6_2, R.drawable.mb6_3, R.drawable.mb6_4},
            {R.drawable.mb7_1, R.drawable.mb7_2, R.drawable.mb7_3, R.drawable.mb7_4},
            {R.drawable.mb8_1, R.drawable.mb8_2, R.drawable.mb8_3, R.drawable.mb8_4},
            {R.drawable.mb9_1, R.drawable.mb9_2, R.drawable.mb9_3, R.drawable.mb9_4},
            {R.drawable.mb10_1, R.drawable.mb10_2, R.drawable.mb10_3, R.drawable.mb10_4},

            {R.drawable.ram1_1, R.drawable.ram1_2, R.drawable.ram1_3, R.drawable.ram1_4},
            {R.drawable.ram2_1, R.drawable.ram2_2, R.drawable.ram2_3, R.drawable.ram2_4},
            {R.drawable.ram3_1, R.drawable.ram3_2, R.drawable.ram3_3, R.drawable.ram3_4},
            {R.drawable.ram4_1, R.drawable.ram4_2, R.drawable.ram4_3, R.drawable.ram4_4},
            {R.drawable.ram5_1, R.drawable.ram5_2, R.drawable.ram5_3, R.drawable.ram5_4},
            {R.drawable.ram6_1, R.drawable.ram6_2, R.drawable.ram6_3, R.drawable.ram6_4},
            {R.drawable.ram7_1, R.drawable.ram7_2, R.drawable.ram7_3, R.drawable.ram7_4},
            {R.drawable.ram8_1, R.drawable.ram8_2, R.drawable.ram8_3, R.drawable.ram8_4},
            {R.drawable.ram9_1, R.drawable.ram9_2, R.drawable.ram9_3, R.drawable.ram9_4},
            {R.drawable.ram10_1, R.drawable.ram10_2, R.drawable.ram10_3, R.drawable.ram10_4},

            {R.drawable.gpu1_1, R.drawable.gpu1_2, R.drawable.gpu1_3, R.drawable.gpu1_4},
            {R.drawable.gpu2_1, R.drawable.gpu2_2, R.drawable.gpu2_3, R.drawable.gpu2_4},
            {R.drawable.gpu3_1, R.drawable.gpu3_2, R.drawable.gpu3_3, R.drawable.gpu3_4},
            {R.drawable.gpu4_1, R.drawable.gpu4_2, R.drawable.gpu4_3, R.drawable.gpu4_4},
            {R.drawable.gpu5_1, R.drawable.gpu5_2, R.drawable.gpu5_3, R.drawable.gpu5_4},
            {R.drawable.gpu6_1, R.drawable.gpu6_2, R.drawable.gpu6_3, R.drawable.gpu6_4},
            {R.drawable.gpu7_1, R.drawable.gpu7_2, R.drawable.gpu7_3, R.drawable.gpu7_4},
            {R.drawable.gpu8_1, R.drawable.gpu8_2, R.drawable.gpu8_3, R.drawable.gpu8_4},
            {R.drawable.gpu9_1, R.drawable.gpu9_2, R.drawable.gpu9_3, R.drawable.gpu9_4},
            {R.drawable.gpu10_1, R.drawable.gpu10_2, R.drawable.gpu10_3, R.drawable.gpu10_4}
    };

    static String[] description = {
            "AMD AM4\n" + "Yes\n" + "X570\n" + "ATX\n" + "DDR4\n",
            "AMD AM4\n" + "Yes\n" + "X570\n" + "ATX\n" + "DDR4\n",
            "AMD AM4\n" + "No\n" + "X570\n" + "ATX\n" + "DDR4\n",
            "AMD AM4\n" + "No\n" + "B550\n" + "ATX\n" + "DDR4\n",
            "AMD AM4\n" + "Yes\n" + "A520\n" + "mini-ITX\n" + "DDR4\n",
            "AMD AM4\n" + "Yes\n" + "B550\n" + "mini-ITX\n" + "DDR4\n",
            "AMD AM4\n" + "No\n" + "A520\n" + "mATX\n" + "DDR4\n",
            "AMD AM4\n" + "Yes\n" + "B550\n" + "ATX\n" + "DDR4\n",
            "AMD AM4\n" + "No\n" + "B450\n" + "mATX\n" + "DDR4\n",
            "AMD AM4\n" + "Yes\n" + "X570\n" + "ATX\n" + "DDR4\n",

            "DIMM\n" + "DDR4\n" + "32GB (2 x 16GB)\n" + "3200Mhz\n" + "CL16\n" + "1.35 Volts\n",
            "DDR4\n" + "DIMM\n" + "16GB (2 x 8GB)\n" + "3200Mhz\n" + "CL16\n" + "1.35 Volts\n",
            "DDR4\n" + "DIMM\n" + "16GB (2 x 8GB)\n" + "3600Mhz\n" + "CL18\n" + "1.35 Volts\n",
            "DDR4\n" + "DIMM\n" + "32GB (2 x 16GB)\n" + "3200Mhz\n" + "CL16\n" + "1.35 Volts\n",
            "DIMM\n" + "DDR4\n" + "32GB (2 x 16GB)\n" + "3600Mhz\n" + "CL16\n" + "1.35 Volts\n",
            "DDR4\n" + "DIMM\n" + "16GB (2 x 8GB)\n" + "2666Mhz\n" + "CL16\n" + "1.35 Volts\n",
            "DDR4\n" + "DIMM\n" + "16GB (2 x 8GB)\n" + "3200Mhz\n" + "CL16\n" + "1.35 Volts\n",
            "DIMM\n" + "DDR4\n" + "32GB (2 x 16GB)\n" + "3600Mhz\n" + "CL18\n" + "1.35 Volts\n",
            "DIMM\n" + "DDR4\n" + "32GB (2 x 16GB)\n" + "3600Mhz\n" + "CL18\n" + "1.35 Volts\n",
            "DIMM\n" + "DDR4\n" + "16GB (2 x 8GB)\n" + "5000Mhz\n" + "CL19\n" + "1.55 Volts\n",

            "RTX 3060\n" + "12GB\n" + "4\n" + "300mm\n" + "3\n",
            "RX 6700 XT\n" + "12GB\n" + "4\n" + "320mm\n" + "3\n",
            "RX 6700 XT\n" + "12GB\n" + "4\n" + "310mm\n" + "3\n",
            "RX 6700 XT\n" + "12GB\n" + "4\n" + "303mm\n" + "3\n",
            "RX 6900 XT\n" + "16GB\n" + "4\n" + "286mm\n" + "2\n",
            "RX 6900 XT\n" + "16GB\n" + "4\n" + "320mm\n" + "3\n",
            "RX 6700 XT\n" + "12GB\n" + "4\n" + "281mm\n" + "2\n",
            "RX 6900 XT\n" + "16GB\n" + "4\n" + "310mm\n" + "3\n",
            "RTX 3070\n" + "8GB\n" + "4\n" + "319mm\n" + "3\n",
            "RTX 3090\n" + "24GB\n" + "4\n" + "320mm\n" + "3\n"
    };

    static double[] price = {365.00, 484.99, 270.00, 237.99, 175.00, 365.00, 129.00, 304.99, 199.94, 429.94,
                             309.99, 214.99, 249.00, 394.99, 452.04, 148.99, 275.00, 368.99, 469.28, 1699.00,
                             1268.99, 1498.99, 1498.99, 1329.00, 3498.99, 2499.00, 1699.00, 2643.85, 1999.00, 3848.99};

    public static void initializeItems(){
        for(int i = 0; i < name.length; i++){
            //this is the only time new Item should be called (it mucks things up otherwise)
            Item.addItem(new Item(category[i],name[i],mainImage[i],description[i],price[i],1));
        }
    }

    public static int[] getCategory(int categoryID){
        List<Integer> ids = new ArrayList<Integer>();
        for(Item item : Item.items){
            if(item.getCategory() == Category.getCategory(categoryID)){
                ids.add(item.getID());
            }
        }
        int[] list = new int[ids.size()];
        for(int i =0; i < ids.size(); i++){
            list[i] = ids.get(i);
        }
        return list;
    }

    /**public static ArrayList<Item> getProducts() {
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
    }**/

    public int[] searchResults(String search) {
        ArrayList<Item> products = new ArrayList<Item>();
        int i = 0;
        int productsIndex = 0;
        search = search.toLowerCase();
        for (Category index : category) {
            // contains is case sensitive
            String nameLower = name[i].toLowerCase();
            String index_name = index.getName().toLowerCase();
            if (index_name.contains(search) || nameLower.contains(search)) {
                products.set(productsIndex, Item.getItem(i));
                productsIndex++;
            }
            i++;
        }
        int[] list = new int[products.size()];
        for(int j = 0; j < products.size(); j++){
            list[j] = products.get(j).getID();
        }
        return list;
    }

}
