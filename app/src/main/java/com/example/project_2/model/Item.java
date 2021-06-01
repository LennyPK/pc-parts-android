package com.example.project_2.model;

import com.example.project_2.R;

import java.util.ArrayList;
import java.util.List;

public class Item {

    private static int currentID = 0;
    private int id;
    private Category category;
    private String title;
    private List<Integer> imageIDs;
    private int mainImageID;
    private String description;
    private double price;

    public static List<Item> items = new ArrayList<Item>();

    public Item(Category category, String title, int mainImageID, String description, double price) {
        this.category = category;
        this.title=title;
        this.imageIDs=imageIDs;
        this.description=description;
        this.mainImageID = mainImageID;
        this.price=price;
        this.id = currentID++;
    }

    public String getTitle(){
        return title;
    }

    public List<Integer> getImageIDs() {
        return imageIDs;
    }

    public int getMainImageID(){
        return mainImageID;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice(){
        return price;
    }

    public int getID() {
        return id;
    }

    public void addImageID(int imageID){
        imageIDs.add(imageID);
    }

    public static Item getItem(int id){
        return items.get(id);
    }

    public static String[] getTitlesList(){
        String[] list = new String[items.size()];
        for(int i = 0; i < items.size(); i++){
            list[i] = items.get(i).getTitle();
        }
        return list;
    }

    public static String[] getTitlesList(int[] ids){
        String[] list = new String[ids.length];
        for(int i = 0; i < ids.length; i++){
            list[i] = items.get(i).getTitle();
        }
        return list;
    }

    public static int[] getImageIDsList(){
        int[] list = new int[items.size()];
        for(int i = 0; i < items.size(); i++){
            list[i] = items.get(i).getMainImageID();
        }
        return list;
    }

    public static int[] getImageIDsList(int[] ids){
        int[] list = new int[ids.length];
        for(int i = 0; i < ids.length; i++){
            list[i] = items.get(i).getMainImageID();
        }
        return list;
    }

    public static double[] getPricesList(){
        double[] list = new double[items.size()];
        for(int i = 0; i < items.size(); i++){
            list[i] = items.get(i).getPrice();
        }
        return list;
    }

    public static double[] getPricesList(int[] ids){
        double[] list = new double[ids.length];
        for(int i = 0; i < ids.length; i++){
            list[i] = items.get(i).getPrice();
        }
        return list;
    }

    public static void addItem(Item i){
        if(!items.contains(i)){
            items.add(i);
        }
    }

    //don't know how else to do this, there's probably a better way
    //if this is not run for both MainActivity and ListActivity, errors happen
    //This will be done by DataLoader code later
    public static void INITIALIZE_ITEMS(){
        addItem(new Item(Category.getCategory("Motherboard"), "Item #1", R.drawable.asus1_2, "Description #1", 99.99));
        addItem(new Item(Category.getCategory("Motherboard"), "Item #2", R.drawable.asus2_2, "Description #2", 199.99));
        addItem(new Item(Category.getCategory("Motherboard"), "Item #3", R.drawable.asus1_1, "Description #3", 349.99));
        addItem(new Item(Category.getCategory("Motherboard"), "Item #4", R.drawable.asus3_2, "Description #4", 129.99));
    }
}
