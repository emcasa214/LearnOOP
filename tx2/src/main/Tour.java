/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Trang
 */
public class Tour extends Product {
    
    private String tour_number_dates;
    private String tour_transport;

    public Tour() {
    }

    public Tour(String tour_number_dates, String tour_transport) {
        this.tour_number_dates = tour_number_dates;
        this.tour_transport = tour_transport;
    }

    public Tour(int product_id, String product_name,float product_price, int product_total,String tour_number_dates, String tour_transport) {
        super(product_id, product_name, product_price, product_total);
        this.tour_number_dates = tour_number_dates;
        this.tour_transport = tour_transport;
    }
   
    @Override
    public double getTotalPrice() {
        return getProduct_total() * getProduct_price()+ 0.10*(getProduct_total()*getProduct_price());
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
