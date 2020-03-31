package main.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product product;
    public void setup(){
        product = new Product(100, 2, 34);
    }
    @Test
    void getId() {
        assertEquals(2, product.getId());
    }
}