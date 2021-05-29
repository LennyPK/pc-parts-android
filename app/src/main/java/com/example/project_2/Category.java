package com.example.project_2;

import java.util.ArrayList;

public class Category {

    private String name;
    private int imageID;

    public static ArrayList<Category> categories;

    public Category(String name, int imageID){
        this.name=name;
        this.imageID=imageID;
    }

    public String getName(){
        return name;
    }

    public int getImageID(){
        return imageID;
    }

    public static Category getCategory(String name){
        for (Category c : categories) {
            if(c.getName() == name){
                return c;
            }
        }
        return null;
    }
}