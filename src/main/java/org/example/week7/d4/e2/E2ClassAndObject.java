package org.example.week7.d4.e2;

public class E2ClassAndObject {
    public static void main(String[] args) {
        // Create a class named 'Car'

        // Declare a String variable named 'carColor'
        // Declare an integer variable named 'carYear'
        // Declare a String variable named 'carMake'

        // Create the first object of the class 'Car'
        Car car1 = new Car();
        Car car2 = new Car();

        car1.carColor = "Black";
        car1.carYear = 2019;
        car1.carMake = "BMW";

        car2.carColor = "White";
        car2.carYear = 2018;
        car2.carMake = "Toyota";

        Car [] cars = {car1, car2};

        for ( int i = 0; i < 2; i++) {
            System.out.println("Car color is "+cars[i].carColor+" and car year is "+cars[i].carYear+" and car model is "+cars[i].carMake);
        }

        // Assign the value "Black" to the 'carColor' variable of the first object
        // Assign the value 2019 to the 'carYear' variable of the first object
        // Assign the value "BMW" to the 'carMake' variable of the first object

        // Create the second object of the class 'Car'

        // Assign the value "White" to the 'carColor' variable of the second object
        // Assign the value 2018 to the 'carYear' variable of the second object
        // Assign the value "Toyota" to the 'carMake' variable of the second object

        // Print the values of the properties for both objects in the specified format



    }
}
class Car {
    String carColor;
    int carYear;
    String carMake;
}
