package com.raj.nola.shop;

import java.util.ArrayList;
import java.util.List;

public class DataSet {

    List<Product> getCart(){

        List<Product> cartItems = new ArrayList();

        cartItems.add(new Product("Product 1", 100));
        cartItems.add(new Product("Product 2", 150));
        cartItems.add(new Product("Product 3", 350.61));
        cartItems.add(new Product("Product 4", 210.80));
        cartItems.add(new Product("Product 5", 340.80));
        cartItems.add(new Product("Product 6", 220));
        cartItems.add(new Product("Product 7", 1000));
        cartItems.add(new Product("Product 8", 675));
        cartItems.add(new Product("Product 9", 3267));
        cartItems.add(new Product("Product 10", 600));
        cartItems.add(new Product("Product 11", 800.50));
        cartItems.add(new Product("Product 12", 20.50));
        cartItems.add(new Product("Product 13", 50));
        cartItems.add(new Product("Product 14", 40.90));
        cartItems.add(new Product("Product 15", 30.80));
        cartItems.add(new Product("Product 16", 2500));
        cartItems.add(new Product("Product 17", 300));
        cartItems.add(new Product("Product 18", 60.50));
        cartItems.add(new Product("Product 19", 110));
        cartItems.add(new Product("Product 20", 190));

        return cartItems;
    }
}
