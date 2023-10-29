package org.byteqore;

import java.util.Scanner;

public class StringOperations {
    public StringOperations() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Kindly select the topic you need to perform StringOperations on.");
        System.out.println("1.Print upper case string " + "\n 2. Print lower case string");

        Scanner ScannerObj = new Scanner(System.in);
        int choice = ScannerObj.nextInt();

        switch (choice) {
            case 1:
                performUppercaseOperation();
                break;
            case 2:
                performLowercaseOperation();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static void performUppercaseOperation() {
        Scanner oneObj = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = oneObj.nextLine();
        String upperCaseString = inputString.toUpperCase();
        System.out.println("Uppercase:" + upperCaseString);
    }

    public static void performLowercaseOperation() {
        Scanner oneObj = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = oneObj.nextLine();
        String lowerCaseString = inputString.toLowerCase();
        System.out.println("Lowercase:" + lowerCaseString);
    }
}