package org.example.week7.d4.e1;

public class E1ClassAndObject {
    public static void main(String[] args) {
        // Create a class named 'Student'

        // Declare a String variable named 'name' and an integer variable named 'roll_no'

        // Create an object of the class 'Student'
        Student student = new Student();

        student.name = "John";
        student.roll_no = 2;

        System.out.println("Name is "+student.name+" and roll number is "+student.roll_no);
        // Assign the value "John" to the 'name' variable

        // Assign the value 2 to the 'roll_no' variable

        // Print the values of 'name' and 'roll_no' in the specified format

    }
}
class Student {
    String name;
    int roll_no;
}
