package org.example.week7.d6.e1;

public class E1StringManipulationsP4 {
    public static void main(String[] args) {

        String dataString = "ID:12345-NAME:John Doe-AGE:30-CITY:New York";
        String ID = dataString.substring(3,8);
        // System.out.println(ID);
        String fullName = dataString.substring(14,22);
        String age = dataString.substring(27,29);
        String city = dataString.substring(30, dataString.length());

        System.out.println("ID: "+ID);
        System.out.println("Name: "+fullName);
        System.out.println("Age: "+age);
        System.out.println("City Info: "+city);

// Step 1: Declare a String variable named `dataString`

// Step 2: Use the substring() method to extract the ID

// Step 3: Use the substring() method to extract the full name

// Step 4: Use the substring() method to extract the age

// Step 5: Use the substring() method to extract everything from the CITY field to the end

// Step 6: Print the results of your extractions






    }
}
