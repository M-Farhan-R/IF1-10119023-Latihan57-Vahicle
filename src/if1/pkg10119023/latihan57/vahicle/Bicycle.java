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
public class Bicycle extends Vehicle{
    private int myGearCount;
    
    public Bicycle(){
        System.out.println(getClass().getSimpleName());
    }
    
    public int getGearCount(){
        return myGearCount;
    }
    
    public void setGearCount(int gearCount){
        this.myGearCount = gearCount;
    }
}
