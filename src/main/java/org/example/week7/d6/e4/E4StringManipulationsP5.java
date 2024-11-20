package org.example.week7.d6.e4;

public class E4StringManipulationsP5 {
    public static void main(String[] args) {

        String[] phoneNumbers = {"(123) 456-7890", "987-654-3210", "555.444.3333", "444 333 2222", "12345678901"};

        for (String phoneNumber : phoneNumbers) {
            String digitsOnly = phoneNumber.replaceAll("[^\\d]", "");

            String formattedNumber;
            if (digitsOnly.length() == 10) {
                formattedNumber = String.format("(%s) %s-%s",
                        digitsOnly.substring(0, 3),
                        digitsOnly.substring(3, 6),
                        digitsOnly.substring(6));
            } else {
                formattedNumber = digitsOnly;
            }


            System.out.println("Original: " + phoneNumber + ", Formatted: " + formattedNumber);
        }



    }
}
