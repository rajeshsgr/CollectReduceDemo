package com.raj.nola.shop;

import java.util.List;
import java.util.concurrent.ForkJoinPool;

import static java.util.stream.Collectors.summingDouble;

public class ComputeTotalPrice {

    public static void main(String[] args) {

        DataSet objDataSet = new DataSet();

        List<Product> cartItems=objDataSet.getCart();

        double totalPrice=cartItems.
                parallelStream().
                map(x->x.getPrice()).
                collect(summingDouble(Double::doubleValue));

        System.out.println("Total Price "+totalPrice);


        double totalPrice1=cartItems.
                parallelStream().
                map(x->x.getPrice()).
                reduce(0.0,(x,y)->x+y);

        System.out.println("Total Price1 "+totalPrice1);



    }
}
