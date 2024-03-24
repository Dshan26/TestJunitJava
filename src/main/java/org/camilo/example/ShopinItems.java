package org.camilo.example;

import java.util.ArrayList;
import java.util.List;

public class ShopinItems {

    private List<Product> itemsProducts;

    public ShopinItems() {
        this.itemsProducts = new ArrayList<>();
    }

    //method for add
    public void addItems(Product product) {
        itemsProducts.add(product);
    }

    //method for remove
    public void removeItems(Product product) {
        itemsProducts.remove(product);
    }

    //total products
    public double calculteTotalProducts() {
        double total = 0;

        for (Product item : itemsProducts) {
            total += item.getPrice() * item.getQuantity();
        }

        return total;
    }

    public  int getSize(){
        return itemsProducts.size();
    }
}
