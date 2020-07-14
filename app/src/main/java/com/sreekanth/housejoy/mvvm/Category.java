package com.sreekanth.housejoy.mvvm;

import java.util.ArrayList;

public class Category {
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    private ArrayList<SubCategory1> subCategoriesList;

    public ArrayList<SubCategory1> getSubCategoriesList() {
        return subCategoriesList;
    }

    public void setSubCategoriesList(ArrayList<SubCategory1> subCategoriesList) {
        this.subCategoriesList = subCategoriesList;
    }
}
