/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author Trang
 */
public class test {
    public static void main(String[] args) {
        person p = new person ("Meo xinh","21/04/2004",'M',"qtragxinh@gmail.com","0924468852");
        p.setName("Quynh trang");
        p.setDob("16/02/2003");
        p.setGender('M');
        p.setEmail("Hmix@gmail.com");
        p.setPhone("0967228814");
        
        System.out.println(p.toString());
    }
}
