package org.byteqore;

import org.byteqore.StringOperations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to mini project!");
        boolean exit = true;

    while (exit) {
            System.out.println("Kindly select the topic you need to perform operations on.");
            System.out.println(" 1. Operations on Strings " + "\n 2. Operations on Numbers " + "\n 3. Operations on Array " + "\n 4. Operations on List " + "\n 5. Operations on Polymorphism " + "\n 6. Operations on Inheritance " + "\n 7. Operations on Abstraction " + "\n 8. Operations on Maps " + "\n 9. Operations on Database " + "\n 10. Operations on Pattern " + "\n *** Press (0) to exit ***");

            //accept input selection from user to perform action/operation
            Scanner scObj = new Scanner(System.in);
            int inputSelection = scObj.nextInt();
            //Print the User selection to show user that he has selected which operation
            System.out.println("Your input is: " + inputSelection);
            // Write a switch case and create an object of specific class there to perform operations as per the users choice
            switch (inputSelection) {
                case 0:
                    exit = false;
                    System.out.println("Thank you for your valuable time.");
                    break;
                case 1:
                    StringOperations Obj = new StringOperations();
                    break;
                case 2:
                    NumberOperations numObj = new NumberOperations();
                    break;
                case 3:
                    ArrayOperations arrObj = new ArrayOperations();
                    break;
            }
            // Then pass the user selection to the object to call the respective method and perform operation

        }
    }
}

//1. I should be able to see list of all operations i can perform
//2. depending upon the selection acc3
// ept every required input from user itself only (No hardcoded values)
//3. display output in a very nice manner to the user as per his inputs
//4. In case of invalid data or any error or any exception properly handle it and show a nice message to user so that
//   he can change his inputs next time
//5. Every topic will have it's own independent class to perform various operations/functionality
//6. variable names and class names and method names should be Strictly logical
//7. use of inheritance/polymorhism/abstraction/encapsulation should be properly demonstrated and used
//8. each and every file will have point to point comments so that anyone who never saw your code should be able to
//   read your code easily
//9. Strictly NO HARDCODED VALUES TO BE USED
//10. create a new database connection and create a new table to store some values and perform CRUD operations on it
//11. create a github account to push this code time to time on the specific branch on the master repository