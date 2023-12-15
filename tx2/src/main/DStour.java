/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Trang
 */
public class DStour implements TourManager {
    ArrayList<Tour> a = new ArrayList<Tour>();

    @Override
    public void addTour(Tour t) {
        a.add(t);
    }

    @Override
    public void delTour(Tour t) {
      a.remove(t);
    }

    @Override
    public Tour searchTour(String name) {
        for(Tour t:a)
        {
            if(t.product_name.equals(name))
            {
                return t;
            }
        }
        return null;
    }

    @Override
    public void searchTour(double price) {
        for(Tour t:a)
        {
            if(t.product_price==price)
            {
                System.out.println(t.toString());
            }
        }
    }

//    @Override
//    public void sortedTour() {
//        a.sort(Comparator.naturalOrder());
//    }

    @Override
    public double getTotalStorage() {
        double price=0;
        for(Tour t : a)
        {
            price += t.getProduct_price()*t.getProduct_total();
        }
        return price;
    }

    @Override
    public void sortedTour() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
