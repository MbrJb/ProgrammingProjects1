package com.example.interview
/*
8. The following program will compile and run, but it uses poor programming style.
Modify the program so that it uses the spelling conventions, constant naming
conventions, and formatting style recommended in this book.
		public class vehicleAvgSpeed {
		public static void main(String[] args)
		{
		double TIME;
		
System.out.println("This program calculates vehicle average speed
given a time and distance traveled.");
		 TIME = 20.5;
		 AVERAGE_SPEED = distance / TIME;
		 System.out.println("Car average speed is " + AVERAGE_SPEED
+ " miles per hour.");
		}
		public static final double distance = 180;
		}
 */
    fun vehicleAverageSpeed(distance: Double, time: Double): Double {
    return distance / time
}

    fun main() {

        println("This program calculates vehicle average speed given a time and distance traveled.")
        println("Car average speed is ${(vehicleAverageSpeed(180.0, 20.5)).toFloat()} miles per hour.")


}