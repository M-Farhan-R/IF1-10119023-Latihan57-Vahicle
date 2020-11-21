/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119023.latihan57.vahicle;

/**
 *
 * @author Muhammad Farhan R <farhan.10119023@mahasiswa.email.ac.id>
 */
public class Vehicle {
    private String myBrand,myModel;
    
    public Vehicle(){
        System.out.println("");
    }
    
    public String getBrand(){
        return myBrand;
    }
    
    public void setBrand(String brand){
        myBrand = brand;
    }
    
    public String getModel(){
        return myModel;
    }
    
    public void setModel(String model){
        myModel = model;
    }
}
