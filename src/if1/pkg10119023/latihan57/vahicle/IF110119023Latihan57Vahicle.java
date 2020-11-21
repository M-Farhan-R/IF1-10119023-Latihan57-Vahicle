/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan57.vahicle;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R  
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program : program data kendaraan...
 *
 */
public class IF110119023Latihan57Vahicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle[] v = new Vehicle[2];
        v[0] = new Bicycle();
        Bicycle b = (Bicycle)v[0];
        String[] a = new String[2];
        
        v[0].setBrand("Trek Bike");
        v[0].setModel("7.4FX");
        b.setGearCount(23);
        a[0]="Jumlah Gear : "+b.getGearCount();
        System.out.println("Brand : "+v[0].getBrand());
        System.out.println("Model : "+v[0].getModel());
        System.out.println(a[0]);
        
        v[1]=new Skateboard();
        Skateboard s = (Skateboard)v[1];
        v[1].setBrand("Ally Skate");
        v[1].setModel("Rocket");
        s.setBoardLength(54.5);
        a[1]="Panjang board : "+s.getBoardLength();
        System.out.println("Brand : "+v[1].getBrand());
        System.out.println("Model : "+v[1].getModel());
        System.out.println(a[1]);
    }

}
