package org.example.week7.d5.e3;

public class E3StringManipulationsP2 {
    public static void main(String[] args) {
       String email = "alex@example.com";

       boolean result1 = email.contains("@");
       boolean result2 = email.startsWith("info");
       boolean result3 = email.endsWith(".com");
       String domain = email.substring(5,16);

        System.out.println("Contains '@'? "+result1);
        System.out.println("Starts with 'info'? "+result2);
        System.out.println("Ends with '.com'? "+result3);
        System.out.println("Domain name: "+domain);
    }
}
