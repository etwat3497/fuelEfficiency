/*
 * Created by Ethan Watt
 * On October 28,2016
 * Designed to demonstrate abstract superclasses and the use of subclasses in determining how many KM different vehicles can go in so many litres
 */

package fuelefficiency;
//Add imports
import java.text.DecimalFormat;
import java.util.ArrayList;
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
        //Declare variables and arrays
        double litres = 0;
        int vehicleChoice = 0;
        Boolean vehicleChoiceLoop = true, litresLoop = true;
        
        //Create an arraylist to store vehicle objects
        ArrayList<Vehicle>objects = new ArrayList();
        Scanner input = new Scanner(System.in);
        
        
        //Determine how many litres the car has
        while(litresLoop){
            try{
                //Get user input
                System.out.println("How many litres of gas do the vehicle(s) have?");
                litres = Double.parseDouble(input.nextLine());
                
                //Catch bad user input  
                if(litres<0){
                    System.out.println("You cannot have a negative amount of litres!");
                }
                //Exit while loop
                else{
                    litresLoop = false;
                }
            }
            //Catch bad user input
            catch(NumberFormatException e){
                System.out.println("Please input an integer value.");
            }
        }
        
        System.out.println("What types of vehicle(s) do you want to test?\nType 1 for a car, "
        + "2 for a truck, 3 for a hybrid car, 4 for a motorcycle, and 5 to display the results.");
        //While loop to determine which vehicle subclasses to run
        while(vehicleChoiceLoop){
            try{
                //Get user input
                System.out.println("Please input what type of vehicle you want to test.");
                vehicleChoice = Integer.parseInt(input.nextLine());

                //Determine which subclass to run based on input
                if(vehicleChoice == 1){
                    //Add a new car class to the vehicle arraylist - polymorphism
                    objects.add(new Car(litres));
                    System.out.println("Will show a car's fuel efficiency when the results are displayed.");
                }
                else if(vehicleChoice == 2){
                    //Add a new truck class to the vehicle arraylist - polymorphism
                    objects.add(new Truck(litres));
                    System.out.println("Will show a truck's fuel efficiency when the results are displayed.");
                }
                else if(vehicleChoice == 3){
                    //Add a new hybrid car class to the vehicle arraylist - polymorphism
                    objects.add(new HybridCar(litres));
                    System.out.println("Will show a hybrid car's fuel efficiency when the results are displayed.");
                }
                else if(vehicleChoice == 4){
                    //Add a new motorcycle class to the vehicle arraylist - polymorphism
                    objects.add(new Motorcycle(litres));
                    System.out.println("Will show a motorcycle's fuel efficiency when the results are displayed.");
                }
                
                //If 5 end the program
                else if(vehicleChoice == 5){
                    vehicleChoiceLoop = false;
                }
                //Catch bad user input
                else{
                    System.out.println("Please choose between 1 and 5.");
                }
            }
            //Catch non integer inputs
            catch(NumberFormatException e){
                System.out.println("Please input an integer value.");
            }
        }
        
        //Run for loop for size of arraylist
        for(int j=0; j<objects.size();j++){
            //Run get distance and to string methods in the subclass located at index j of arraylist
            objects.get(j).getDistance();
            System.out.println(objects.get(j).toString());
        }
    }  
}
