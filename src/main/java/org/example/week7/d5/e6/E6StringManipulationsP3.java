package org.example.week7.d5.e6;

public class E6StringManipulationsP3 {
    public static void main(String[] args) {

        String sentence = "The quick brown fox jumps over the lazy dog.";

        int firstOInd = sentence.indexOf('o');
        int jumpsInd = sentence.indexOf("jumps");
        int zAfter20Ind = sentence.indexOf('z', 20);
        int catInd = sentence.indexOf("cat");

        System.out.println("Position of first 'o': "+firstOInd);
        System.out.println("Position of \"jumps\": "+jumpsInd);
        System.out.println("Position of 'z' after index 20: "+zAfter20Ind);
        System.out.println("Position of \"cat\": "+catInd);

// Hint 1: Think about a string containing all these words - what's a famous sentence with 'fox' and 'dog'?

// Hint 2: Remember indexOf() finds single characters using '' quotes, not ""

// Hint 3: For finding words like "jumps", use "" quotes with indexOf()

// Hint 4: To start searching from a specific position, indexOf() can take two arguments

// Hint 5: When searching for something that doesn't exist, what special value should you expect?
    }
}
