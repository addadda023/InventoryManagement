package main.java;

import java.util.ArrayList;
import java.util.List;

public class InventoryManagement {

    public static void main(String[] args){

        ArrayList<Product> productList = new ArrayList<Product>();
        productList.add(new Product(100, 1, 2));
        productList.add(new Product(100, 2, 3));
        productList.add(new Product(89, 3, 7));
        productList.add(new Product(95.5, 4, 12));

        /*
        Product p1 = new Product(100, 1, 2);
        Product p2 = new Product(200, 2, 5);
        Product p3 = new Product(89, 3, 7);
        Product p4 = new Product(95.5, 4, 12);
         */

        Inventory i = new Inventory();
        for (Product p: productList){
            i.addProduct(p);
        }

        // print before making changes
        i.showInventory();
        // make changes
        System.out.println("Attempting to make changes.");
        i.decrQntyProduct(productList.get(1).getId(), 5);
        i.incrQntyProduct(productList.get(0).getId(), 1);
        i.incrPriceProduct(productList.get(2).getId(), 140);
        i.incrPriceProduct(productList.get(3).getId(), 500);
        i.showInventory();
    }
}
