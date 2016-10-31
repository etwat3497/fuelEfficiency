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
public abstract class Vehicle {
    //Declare global variables
    public double litersOfFuel, distance;
      
    //Create an abstract method to get distance
    public abstract double getDistance();
         
    //Create an abstract method to output string
    public abstract String toString();

}