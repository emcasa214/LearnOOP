
import java.util.ArrayList;
import java.util.Scanner;
import main.DStour;
import main.Tour;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Trang
 */
public class demo {
    static DStour ds = new DStour ();
    public static void fakeData()
    {
        Tour t1 = new Tour (1,"SaPa",3000000,200,"2N1D","Tàu Hỏa");
        Tour t2 = new Tour (2,"Can Tho",15000000,300,"3N2D","May Bay");
        Tour t3 = new Tour (3,"Da Nang",5000000,100,"2N1D","O To");
        Tour t4 = new Tour (4,"Sam Son",2000000,300,"2N1D","O To");
        Tour t5 = new Tour (5,"Da Lat",7000000,200,"3N2D","Tàu Hỏa");
        
        ds.addTour(t1);
        ds.addTour(t2);
        ds.addTour(t3);
        ds.addTour(t4);
        ds.addTour(t5);
        
    }
    public static void thaoTac()
    {
        int n;
        Scanner sc = new Scanner (System.in);
        System.out.println("1: Xoa tour khoi danh sach");
        System.out.println("2: Tim ten gan dung theo tour");
        System.out.println("3: Tim ten gan dung theo gia");
        System.out.println("4: sap xep theo gia san pham");
        System.out.println("5: tinh tong tien toan bo kho san pham");
        System.out.print("Vui long chon: ");
        n=sc.nextInt();
        if(n==1)
        {
            System.out.print("Nhap ten tour can xoa: ");
            sc.nextLine(); 
            String name = sc.nextLine();
            ds.delTour(ds.searchTour(name));
        }
        else if(n==2)
        {
            System.out.print("Nhap ten tour can tim: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Thong tin Tour: "+ds.searchTour(name).toString());
        }
        
    }
    public static void main(String[] args) {
        fakeData();
        thaoTac();
        
                          
    }
           
}
