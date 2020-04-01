package main.java;

/**
 * Class associated with Product
 */

public class Product {
    private double price;
    private int id;
    private int quant;

    // constructor
    public Product(double price, int id, int quant){
        this.price = price;
        this.id = id;
        this.quant = quant;
    }

    public int getId(){
        return this.id;
    }
    public double getPrice(){
        return this.price;
    }
    public int getQuant(){
        return this.quant;
    }
    public void incrQuant(int newQuant){
        this.quant += newQuant;
    }
    public void decrQuant(int newQuant){
        this.quant -= newQuant;
    }
    public void incrPrice(double newPrice){
        this.price += newPrice;
    }
    public void decrPrice(double newPrice){
        this.price -= newPrice;
    }
    public double getNetPrice(){
        return this.quant * this.price;
    }
}
