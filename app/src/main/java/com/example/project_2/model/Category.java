package com.example.project_2.model;

import java.util.ArrayList;

public class Category {

    private String name;
    private int imageID;
    private static int currentID = 0;
    private int id;
    private String description;

    public static ArrayList<Category> categories = new ArrayList<Category>();

    public Category(String name, int imageID, String description){
        this.name=name;
        this.imageID=imageID;
        this.description=description;
        this.id = currentID++;
        if (getCategory(name)==null){
            categories.add(this);
        }
    }

    public String getName(){
        return name;
    }

    public int getImageID(){
        return imageID;
    }

    public int getID(){
        return id;
    }

    public String getDescription(){
        return description;
    }

    public static Category getCategory(String name){
        for (Category c : categories) {
            if(c.getName() == name){
                return c;
            }
        }
        return null;
    }
    public static Category getCategory(int id){
        return categories.get(id);
    }

    public static String[] getNamesList(){
        String[] list = new String[categories.size()];
        for(int i = 0; i < categories.size(); i++){
            list[i] = categories.get(i).getName();
        }
        return list;
    }
}