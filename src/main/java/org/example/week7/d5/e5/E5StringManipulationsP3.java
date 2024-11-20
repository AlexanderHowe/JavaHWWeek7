package org.example.week7.d5.e5;

public class E5StringManipulationsP3 {
    public static void main(String[] args) {

        String emailAddress = "user@example.com";
// Hint 1: Declare and initialize your email string - think about a valid email format

        char firstChar = emailAddress.charAt(0);
        char fifthChar = emailAddress.charAt(4);

        boolean q1;
        boolean q2;

        if (firstChar >= 'a' && firstChar <= 'z' || firstChar >= 'A' && firstChar <= 'Z') {
            q1 = true;
        } else {
            q1 = false;
        }

        if (fifthChar == '@') {
            q2 = true;
        } else {
            q2 = false;
        }

        System.out.println("Email starts with a letter: "+q1);
        System.out.println("5th character is @: "+q2);

// Hint 2: Remember index 0 gives you the first character of any string

// Hint 3: Use >= and <= with a-z and A-Z to check for letters, combine with OR (||)

// Hint 4: The 5th character is at index 4 (since counting starts at 0)

// Hint 5: Use == to compare characters
    }
}
