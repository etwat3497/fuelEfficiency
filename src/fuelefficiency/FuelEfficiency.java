/*
 * Created by Ethan Watt
 * On October 28,2016
 * Designed to demonstrate abstract superclasses and the use of subclasses in determining how many KM different vehicles can go in so many litres
 */

package fuelefficiency;
//Add imports
import java.util.Scanner;

/**
 *
 * @author etwat3497
 */
public class FuelEfficiency {

   /**
    * pre: String array
    * post: void
    * Main method to have the account tester communicate with the account class and it's subclasses
    */
    public static void main(String[] args) {
        // declare variables and arrays
        double litres = 0;
        //Vehicle array to store vehicle objects -Could not figure out how to make this work
        //Vehicle theArray[] = new Vehicle[4];
        //String[] classNames = {"Truck","Car","HybridCar","Motorcycle"};
        Vehicle obj;
        
        //Determine how many litres the car has
        Scanner input = new Scanner(System.in);
        System.out.println("How many litres of gas do the vehicles have?");
        litres = Double.parseDouble(input.nextLine());   
        
        //Run vehicle objects, calculate distance and output the distance travelled
        
        //for(int i=0; i<=4;i++){
            //obj = new Truck(litres);
            //obj.getDistance();
            //System.out.println(obj.toString());
        //}
        
        obj = new Truck(litres);
        obj.getDistance();
        System.out.println(obj.toString());
        
        obj = new Car(litres);
        obj.getDistance();
        System.out.println(obj.toString());
        
        obj = new HybridCar(litres);
        obj.getDistance();
        System.out.println(obj.toString());
        
        obj = new Motorcycle(litres);
        obj.getDistance();
        System.out.println(obj.toString());
    }
    
}
