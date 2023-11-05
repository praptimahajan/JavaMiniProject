package org.byteqore;

import java.util.Scanner;

public class MagicCode {
    String inputString;

    MagicCode() {
        System.out.println("Enter the String you want to print magically");
        Scanner sc = new Scanner(System.in);
        inputString = sc.nextLine();
        magicStringPrinting(inputString);
    }

    void magicStringPrinting(String inputString) {
        try {

            String abc = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < inputString.length(); i++) {
                for (int j = 0; j < abc.length(); j++) {
                    if (inputString.charAt(i) == ' ') {
                        temp.append(' ');
                        Thread.sleep(500);
                        break;
                    }
                    if (abc.charAt(j) == inputString.charAt(i)) {
                        temp.append(abc.charAt(j));
                        System.out.println(temp);
                        Thread.sleep(50);
                        break;
                    }
                    System.out.println(temp + "" + abc.charAt(j));
                    Thread.sleep(50);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

}
