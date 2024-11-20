package org.example.week7.d4.e3;

public class E3ClassAndObject {

    public static void main(String[] args) {
        // Create a class named 'Dog'

        // Declare String variables named 'breed', 'name', and 'color'

        // Declare methods named 'bark()', 'run()', and 'play()' that print messages in the specified format

        // Create the first object of the class 'Dog' with breed = "Husky", name = "AnyName", color = "AnyColor"
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.breed = "Husky";
        dog1.name = "James";
        dog1.color = "Black and White";

        dog2.breed = "Bulldog";
        dog2.name = "Sarah";
        dog2.color = "White and Brown";

        dog3.breed = "Labrador";
        dog3.name = "Jessie";
        dog3.color = "Black";

        dog1.bark();
        dog1.run();
        dog1.play();

        dog2.bark();
        dog2.run();
        dog2.play();

        dog3.bark();
        dog3.run();
        dog3.play();
        // Create the second object of the class 'Dog' with breed = "Bulldog", name = "AnyName", color = "AnyColor"

        // Create the third object of the class 'Dog' with breed = "Labrador", name = "AnyName", color = "AnyColor"

        // Call the methods 'bark()', 'run()', and 'play()' for each object



    }
}
class Dog {
    String breed;
    String name;
    String color;

    void bark(){
        System.out.println(breed +" can bark");
    }
    void run(){
        System.out.println(breed +" can run");
    }
    void play(){
        System.out.println(breed+" can play");
    }
}
