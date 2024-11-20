package org.example.week7.d6.e5;

public class E5StringManipulationsP5 {
    public static void main(String[] args) {
        String csvLine = "John Doe,22,Computer Science,3.8,2025";

        String[] fields = csvLine.split(",");

        String fullName = fields[0];
        String age = fields[1];
        String major = fields[2];
        String gpa = fields[3];
        String graduationYear = fields[4];


        int nameWordCount = fullName.split(" ").length;
        int majorLength = major.length();


        System.out.println("Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
        System.out.println("Graduation Year: " + graduationYear);
        System.out.println("Name Word Count: " + nameWordCount);
        System.out.println("Major Length: " + majorLength);



    }
}
