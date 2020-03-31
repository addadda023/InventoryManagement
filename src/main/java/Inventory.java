package main.java;
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Integer, Product> map;

    public Inventory(){
        this.map = new HashMap<Integer, Product>();
    }

    public boolean addProduct(Product prdct){
        if (this.map.containsKey(prdct.getId())){
            return false;
        }
        this.map.put(prdct.getId(), prdct);
        return true;
    }
    public boolean removeProduct(int id){
        if (this.map.containsKey(id)) {
            this.map.remove(id);
            return true;
        }
        else{
            return false;
        }
    }
    public void decrQntyProduct(int id, int qnty){
        // make sure we are not decreasing quantity to less than 0
        int existingQuantity = this.map.get(id).getQuant();
        if (qnty > existingQuantity)
            System.out.println("Provided quantity " + qnty + " is greater than existing quantity " + existingQuantity + " for product " + id + ". Skipping.");
        else
            this.map.get(id).decrQuant(qnty);
    }
    public void incrQntyProduct(int id, int qnty){
        this.map.get(id).incrQuant(qnty);
    }
    public void incrPriceProduct(int id, double price){
        this.map.get(id).incrPrice(price);
    }
    public void decrPriceProduct(int id, double price){
        this.map.get(id).decrPrice(price);
    }
    public void showInventory(){
        System.out.println();
        for (Product prdct: this.map.values()){
            System.out.println("Product Id: " + prdct.getId() + " Product price: " + prdct.getPrice() + " Product quantity: " + prdct.getQuant() + " Total cost: " + prdct.getNetPrice());
       }
    }
}
