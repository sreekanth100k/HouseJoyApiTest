package com.sreekanth.housejoy.mvvm;

import java.util.ArrayList;

public class SubCategory {
    private String subCategory;
    private ArrayList<Product> productList;

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
}
