/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Trang
 */
public abstract class Product {
    protected int product_id;
    protected String product_name;
    protected float product_price;
    protected int product_total;

    public Product() {
    }

    public Product(int product_id, String product_name, float product_price, int product_total) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_total = product_total;
    }

    public float getProduct_price() {
        return product_price;
    }

    public int getProduct_total() {
        return product_total;
    }
    
    public abstract double getTotalPrice();

    @Override
    public String toString() {
        return "Product{" + "product_id=" + product_id + ", product_name=" + product_name + ", product_price=" + product_price + ", product_total=" + product_total + '}';
    }
    
    
    
}
