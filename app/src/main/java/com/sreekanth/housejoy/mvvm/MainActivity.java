package com.sreekanth.housejoy.mvvm;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyViewModel model = ViewModelProviders.of(this).get(MyViewModel.class);

        model.getList().observe(this, new Observer<Flipkart>() {
            @Override
            public void onChanged(@Nullable Flipkart flipkartObj) {
                //Fetching the values and logging the values..

               ArrayList<Category> categoryList =  flipkartObj.getCategoryList();
               Log.d("OuterTag",flipkartObj.getName());
               for(int i =0;i<categoryList.size();i++){
                   Category category = categoryList.get(i);
                   Log.d("Category",category.getCategory());
                   ArrayList<SubCategory1> subcategoriesList = category.getSubCategoriesList();
                   for(int j=0;j<subcategoriesList.size();j++){
                       String subCategory1 = subcategoriesList.get(j).getSubCategory1();
                       Log.d("SubCategory Level1 ",subCategory1);
                       ArrayList<SubCategory> subCategoriesList = subcategoriesList.get(j).subCategories;
                       for(int z=0;z<subCategoriesList.size();z++) {
                          Log.d("SubCategory Level2" ,subCategoriesList.get(z).getSubCategory());
                           ArrayList<Product> productList = subCategoriesList.get(z).getProductList();
                           for (int k = 0; k < productList.size(); k++) {
                               int productId = productList.get(k).getProductId();
                               String productImage = productList.get(k).getProductImage();
                               String productName = productList.get(k).getProductName();

                               Log.d("ProductId", String.valueOf(productId));
                               Log.d("ProductImage", productImage);
                               Log.d("ProductName", productName);

                           }
                       }
                   }
               }
            }
        });
    }
}
