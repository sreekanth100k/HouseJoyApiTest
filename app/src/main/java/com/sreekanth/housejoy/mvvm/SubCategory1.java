package com.sreekanth.housejoy.mvvm;

import java.util.ArrayList;

public class SubCategory1 extends SubCategory {
    private String subCategory1;

    public String getSubCategory1() {
        return subCategory1;
    }

    public void setSubCategory1(String subCategory1) {
        this.subCategory1 = subCategory1;
    }

    public ArrayList<SubCategory> subCategories;

    public ArrayList<SubCategory> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(ArrayList<SubCategory> subCategories) {
        this.subCategories = subCategories;
    }
}
