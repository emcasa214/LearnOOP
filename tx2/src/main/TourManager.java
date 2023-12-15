/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package main;

/**
 *
 * @author Trang
 */
public interface TourManager {
    public void addTour(Tour t);
    public void delTour(Tour t);
    public Tour searchTour(String name);
    public void searchTour(double price);
    public void sortedTour();
    public double getTotalStorage();
    
}
