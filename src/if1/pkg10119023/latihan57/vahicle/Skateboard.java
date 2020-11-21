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
public class Skateboard extends Vehicle{
    private double myBoardLength;
    
    public Skateboard(){
        System.out.println(getClass().getSimpleName());
    }
    
    public double getBoardLength(){
        return myBoardLength;
    }
    
    public void setBoardLength(double boardLength){
        myBoardLength = boardLength;
    }
}
