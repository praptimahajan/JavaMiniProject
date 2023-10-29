package org.byteqore;

import java.util.Scanner;

public class NumberOperations {

    // create a single or multiple constructors or method input from user to get selection from user to perform operations
    // on the user given values. here you need to give list of operations specific to numbers and based on that accept the inputs
    // and perform operations

    public NumberOperations() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Kindly select the topic you need to perform NumberOperations:");
        System.out.println("1.check if number is even or odd" + "\n2.check if number is prime" + "\n3.check if number is pallindrome" + "\n4.check if number is negative or positive " + "\n5.Print all odd numbers between given range" + " \n6.Print all even numbers between given range" + "\n7.print table of number" + "\n8.print addition" + "\n9.print subtraction" + "\n10. print division " + "\n11. print factorial");

        Scanner scannerObj = new Scanner(System.in);
        int choice = scannerObj.nextInt();
        switch (choice) {
            case 1:
                printEvenOddChecker();
                break;
            case 2:
                primeNumber();
                break;
            case 3:
                checkPalindrome();
                break;
            case 4:
                positiveNegative();
                break;
            case 5:
                oddRanges();
                break;
            case 6:
                evenNumbersBetweenRange();
                break;
            case 7:
                printTableOfNumbers();
                break;
            case 8:
                printAdditionOfNumbers();
                break;
            case 9:
                printSubstractionOfNumbers();
                break;
            case 10:
                printDivisionOfNumbers();
                break;
        }
    }

    //  1. check if number is even or odd
    public static void printEvenOddChecker() {
        Scanner scObj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scObj.nextInt();

        System.out.println("Your input is: " + input);
        if (input % 2 == 0) {
            System.out.println(input + " is even:");
        } else {
            System.out.println(input + " is odd:");
        }
    }

    //2. check if number is prime
    public static void primeNumber() {
        Scanner ScObj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = ScObj.nextInt();
        System.out.println("Your input is: " + number);
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println(number + "Number is not prime number: ");
            } else {
                System.out.println(number + "Number is  Prime number: ");
            }
        }
    }

    //3. check if number is pallindrome
    public static void checkPalindrome() {
        Scanner scObj = new Scanner(System.in);
        System.out.println("Enter a number to check if it is palindrome or not: ");
        int input = scObj.nextInt();
        System.out.println("Your input is: " + input);

        //Ex: 121 ,12321,12344321 is palindrome
        //Ex: 123 ,1231, 123421 not palindrome
        int tempNumber = input;
        int reverseNumber = 0;

        //121 % 10 => 1
        for (int i = 0; input != 0; i++) {
            int digit = input % 10;
            //121 / 10 => 12
            input = input / 10;
            if (input == 0) {
                reverseNumber = (reverseNumber + digit);
            } else {
                reverseNumber = (reverseNumber + digit) * 10;
            }
        }
        if (reverseNumber == tempNumber) {
            System.out.println(tempNumber + " is a palindrome number");
        } else {
            System.out.println(tempNumber + " is not a palindrome number");
        }
    }

    //4. check if number is negative or positive
    public static void positiveNegative() {
        Scanner ScObj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = ScObj.nextInt();
        System.out.println("Your input is: " + number);
        if (number < 0) {
            System.out.println("the number is negative: " + number);
        } else if (number > 0) {
            System.out.println("the number is positive: " + number);
        } else {
            System.out.println("The number is zero.");
        }
    }

    //5. Print all odd numbers between given range
    public static void oddRanges() {
        Scanner ScObj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = ScObj.nextInt();
        System.out.println("Your input is: " + number);
        if (number % 2 != 0) {
            System.out.println("The number is odd: " + number);
        } else {
            System.out.println("The number is not odd: " + number);
        }
    }

    //6. Print all even numbers between given range
    public static void evenNumbersBetweenRange() {
        Scanner ScObj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = ScObj.nextInt();
        System.out.println("Your input is: " + number);
        if (number % 2 != 0) {
            System.out.println("The number is even: " + number);
        } else {
            System.out.println("The number is not even: " + number);
        }
    }

    //7. print table
    public static void printTableOfNumbers() {
        Scanner ScObj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = ScObj.nextInt();
        System.out.println("Your input is: " + number);
        for (int i = 1; i <= 10; i++) {
            int product = number * i;
            System.out.println(number + " * " + i + " = " + product);
        }
    }

    //8. print addition
    public static void printAdditionOfNumbers() {
        Scanner ScObj = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = ScObj.nextInt();
        System.out.println("Your input is: " + number1);
        System.out.println("Enter the second number: ");
        int number2 = ScObj.nextInt();
        System.out.println("Your input is: " + number2);

        int sum = number1 + number2;
        System.out.println("The sum of " + number1 + " and " + number2 + " is " + sum);
    }

    //9. print subtraction
    public static void printSubstractionOfNumbers() {
        Scanner ScObj = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = ScObj.nextInt();
        System.out.println("Your input is: " + number1);
        System.out.println("Enter the second number: ");
        int number2 = ScObj.nextInt();
        System.out.println("Your input is: " + number2);

        int diff = number1 - number2;
        System.out.println("The diff of " + number1 + " or " + number2 + " is " + diff);
    }

    //10. print division
    public static void printDivisionOfNumbers() {
        Scanner ScObj = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = ScObj.nextInt();
        System.out.println("Your input is: " + number1);
        System.out.println("Enter the second number: ");
        int number2 = ScObj.nextInt();
        System.out.println("Your input is: " + number2);

        int div = number1 / number2;
        System.out.println("The div of " + number1 + " % " + number2 + " is " + div);
    }

    //11. print factorial
    public static void printFactorialOfNumber() {
        Scanner ScObj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = ScObj.nextInt();
        System.out.println("Your input is: " + number);
    }
}