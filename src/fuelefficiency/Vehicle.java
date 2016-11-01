/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fuelefficiency;

//Add imports
import java.text.DecimalFormat;


/**
 *
 * @author etwat3497
 */
public abstract class Vehicle {
    //Declare global variables
    public double litersOfFuel, distance;
    DecimalFormat x = new DecimalFormat("##.##");
      
    //Create an abstract method to get distance
    public abstract double getDistance();
         
    //Create an abstract method to output string
    public abstract String toString();
 
    
  /**
   * pre: double unrounded distance travelled 
   * post: double rounded distance travelled
   * Helper method to round distances
   */
    public double rounder(double unroundedDistance){
        DecimalFormat x = new DecimalFormat("00.00");
        double roundedDistance = Double.parseDouble(x.format(unroundedDistance));
        return roundedDistance;
    }
}
