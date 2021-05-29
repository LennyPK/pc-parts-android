package com.example.project_2.model;

import java.util.ArrayList;

public class Category {

    private String name;
    private int imageID;
    private static int currentID = 0;
    private int id;

    public static ArrayList<Category> categories = new ArrayList<Category>();

    public Category(String name, int imageID){
        this.name=name;
        this.imageID=imageID;
        this.id = currentID++;
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

    public static Category getCategory(String name){
        for (Category c : categories) {
            if(c.getName() == name){
                return c;
            }
        }
        return null;
    }

    public static String[] getNamesList(){
        String[] list = new String[categories.size()];
        for(int i = 0; i < categories.size(); i++){
            list[i] = categories.get(i).getName();
        }
        return list;
    }

    public static void addCategory(Category c){
        if (getCategory(c.getName())==null){
            categories.add(c);
        }
    }
    public static void addCategory(String name, int imageID){
        if (getCategory(name)==null){
            categories.add(new Category(name, imageID));
        }
    }
}