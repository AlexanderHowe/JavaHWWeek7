package org.example.week7.d6.e3;

public class E3StringManipulationsP4 {
    public static void main(String[] args) {

        String textMessage = "Hey! R u free 2day? Wanna grab lunch b4 class? LMK ASAP. THX!";

        System.out.println("Original Message: "+textMessage);

        String expandedMessage = textMessage;
        expandedMessage = expandedMessage.replace("R u" , "Are you");
        expandedMessage = expandedMessage.replace("2day" , "today");
        expandedMessage = expandedMessage.replace("Wanna" , "Want to");
        expandedMessage = expandedMessage.replace("b4" , "before");
        expandedMessage = expandedMessage.replace("LMK" , "Let me know");
        expandedMessage = expandedMessage.replace("ASAP" , "as soon as possible");
        expandedMessage = expandedMessage.replace("THX" , "Thanks");

        System.out.println("Expanded Message: "+expandedMessage);
        // Declare the original text message

         // Replace abbreviations with full forms

        // Print the original message and the expanded version

        //String textMessage = "Hey! R u free 2day? Wanna grab lunch b4 class? LMK ASAP. THX!";



    }
}
