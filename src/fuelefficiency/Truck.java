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
public class Truck extends Vehicle {
    
  /**
   * pre: void
   * post: void
   * Default constructor of  class to assign base value to variables
   */
    public Truck(){
        litersOfFuel = 0;
    }
    
  /**
   * pre: liters
   * post: void
   * Alternate constructor that takes input and assigns value to variables
   */
    public Truck(double ltrs){
        litersOfFuel = ltrs;
    }
    
  /**
   * pre: void
   * post: double distance
   * Method to calculate the vehicle can travel
   */
    public double getDistance(){
        distance = (litersOfFuel/14.1)*100;
        return distance;
    }
    
  /**
   * pre: void
   * post: String output
   * Method to display how far the vehicle can go
   */
    public String toString(){
        String output = "Truck = "+distance;
        return output;
    }
}
