package com.example.project_2;

import java.util.ArrayList;

public class Item {

    private static int lastID = 0;
    private int id;
    private Category category;
    private String title;
    private ArrayList<Integer> imageIDs;
    private String description;

    public Item(String categoryName, String title, ArrayList<Integer> imageIDs, String description) {
        this.category = Category.getCategory(categoryName);
        this.title=title;
        this.imageIDs=imageIDs;
        this.description=description;
        this.id = ++lastID;
    }

    public String getTitle(){
        return title;
    }

    public ArrayList<Integer> getImageIDs() {
        return imageIDs;
    }

    public String getDescription() {
        return description;
    }
}
