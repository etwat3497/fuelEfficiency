/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fuelefficiency;

/**
 *
 * @author etwat3497
 */
public class Car extends Vehicle{
 /**
   * pre: void
   * post: void
   * Default constructor of  class to assign base value to variables
   */
    public Car(){
        litersOfFuel = 0;
    }
    
  /**
   * pre: liters
   * post: void
   * Alternate constructor that takes input and assigns value to variables
   */
    public Car(double ltrs){
        litersOfFuel = ltrs;
    }
    
  /**
   * pre: void
   * post: double distance
   * Method to calculate the vehicle can travel
   */
    public double getDistance(){
        //Calculate distance travelled, round the distance and return
        distance = (litersOfFuel/9.4)*100;
        distance = super.rounder(distance);
        return distance;
    }
    
  /**
   * pre: void
   * post: String output
   * Method to display how far the vehicle can go
   */
    public String toString(){
        String output = "Car = "+distance;
        return output;
    }
    
}
