package org.byteqore;

import java.util.Scanner;

public class NumberOperations {

    // create a single or multiple constructors or method input from user to get selection from user to perform operations
    // on the user given values. here you need to give list of operations specific to numbers and based on that accept the inputs
    // and perform operations


    public NumberOperations() {
        System.out.println("Kindly select the topic you need to perform NumberOperations:");
        System.out.println("1.check if number is even or odd" + "\n2.check if number is prime" + "\n3.check if number is pallindrome" + "\n4.check if number is negative or positive " + "\n5.Print all odd numbers between given range" + " \n6.Print all even numbers between given range" + "\n7.print product" + "\n8.print addition" + "\n9.print subtraction" + "\n10. print division " + "\n11. print factorial");

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

                break;
            case 4:
                positivenegative();
                break;
            case 5:
                oddRanges();
                break;
            case 6:
                evenRanges();
                break;
            case 7:
                printproduct();
                break;
            case 8:
                printadd();
                break;
            case 9:
                printsub();
                break;
            case 10:
                printdiv();
                break;


        }
    }

    //  1. check if number is even or odd
    public static void printEvenOddChecker() {
        Scanner scObj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scObj.nextInt();

        System.out.println("You selected: " + input);
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
        System.out.println("You selected: " + number);
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println(number + "Number is not prime number: ");
            } else {
                System.out.println(number + "Number is  Prime number: ");
            }
        }
    }


    //3. check if number is pallindrome
    //public static void pallindrome() {
    //  Scanner scObj = new Scanner(System.in);
    //   System.out.println("Enter a number: ");
    //  int pallindromenumber = scObj.nextInt();
    //   System.out.println("You selected: " + pallindromenumber);
    //   if (pallindromenumber()) {
    //      System.out.println(pallindromenumber + " is a palindromenumber");
    //  } else {
    //      System.out.println(pallindromenumber + " is not a palindromenumber");
    //   }
    //}

//4. check if number is negative or positive

    public static void positivenegative() {
        Scanner ScObj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = ScObj.nextInt();
        System.out.println("You selected: " + number);
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
        System.out.println("You selected: " + number);
        if (number % 2 != 0) {
            System.out.println("The number is odd: " + number);
        } else {
            System.out.println("The number is not odd: " + number);
        }
    }

    //6. Print all even numbers between given range
    public static void evenRanges() {
        Scanner ScObj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = ScObj.nextInt();
        System.out.println("You selected: " + number);
        if (number % 2 != 0) {
            System.out.println("The number is even: " + number);
        } else {
            System.out.println("The number is not even: " + number);
        }
    }


    //7. print product
    public static void printproduct() {
        Scanner ScObj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = ScObj.nextInt();
        System.out.println("You selected: " + number);
        for (int i = 1; i <= number; i++) {
            int product = number * i;
            System.out.println(" number *" + i + " = " + product);
        }
    }

    //8. print addition
    public static void printadd() {
        Scanner ScObj = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = ScObj.nextInt();
        System.out.println("You selected: " + number1);
        System.out.println("Enter the second number: ");
        int number2 = ScObj.nextInt();
        System.out.println("You selected: " + number2);

        int sum = number1 + number2;
        System.out.println("The sum of " + number1 + " and " + number2 + " is " + sum);
    }

    //9. print subtraction
    public static void printsub() {
        Scanner ScObj = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = ScObj.nextInt();
        System.out.println("You selected: " + number1);
        System.out.println("Enter the second number: ");
        int number2 = ScObj.nextInt();
        System.out.println("You selected: " + number2);

        int diff = number1 - number2;
        System.out.println("The diff of " + number1 + " or " + number2 + " is " + diff);
    }


    //10. print division
    public static void printdiv() {
        Scanner ScObj = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = ScObj.nextInt();
        System.out.println("You selected: " + number1);
        System.out.println("Enter the second number: ");
        int number2 = ScObj.nextInt();
        System.out.println("You selected: " + number2);

        int div = number1 / number2;
        System.out.println("The div of " + number1 + " % " + number2 + " is " + div);
    }




//11. print factorial

    public static void factorial() {
        Scanner ScObj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = ScObj.nextInt();
        System.out.println("You selected: " + number);





    }















