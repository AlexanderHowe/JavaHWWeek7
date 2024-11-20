package org.example.week7.d5.e4;

public class E4StringManipulationsP3 {
    public static void main(String[] args) {
        // Step 1: Declare and Assign a String Variable
        String productCode = "KX125";
// Step 2: Use the `charAt()` Method to Analyze the Product Code
        char firstChar = productCode.charAt(0);
        //System.out.println(firstChar);

        boolean q1;
        boolean q2;
        char lastChar = productCode.charAt(productCode.length()-1);
        //System.out.println(lastChar);

        if (firstChar == 'K') {
            q1 = true;
        } else {
            q1 = false;
        }

        if (lastChar == '5') {
            q2 = true;
        } else{
            q2 = false;
        }

        //System.out.println(q1);
        //System.out.println(q2);

        System.out.println("Product code starts with 'K': "+q1);
        System.out.println("Product code ends with '5': "+q2);
// Extract the first character of `productCode`
// Check if the first character is the letter 'K'
// Extract the last character of `productCode`
// Check if the last character is a digit '5'


    }
}
