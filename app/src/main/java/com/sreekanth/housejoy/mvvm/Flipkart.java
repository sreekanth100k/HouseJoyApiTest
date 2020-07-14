package com.sreekanth.housejoy.mvvm;

import java.util.ArrayList;

public class Flipkart {
    private ArrayList<Category> categoryList;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(ArrayList<Category> categoryList) {
        this.categoryList = categoryList;
    }
}
