package org.byteqore;


import java.util.Scanner;

public class ArrayOperations {
    public ArrayOperations() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Kindly select the topic you need to perform ArrayOperations: ");
        System.out.println("1.Print product of all elements in an array " + "\n2.Print minimum of all elements in an array " + "\n3.Print maximum of all elements in an array" + "\n4.Print sum of all elements in an array");

        Scanner scannerObj = new Scanner(System.in);
        int choice = scannerObj.nextInt();
        switch (choice) {
            case 1:
                printproduct();
                break;
            case 2:
                minElementInArray();
                break;
            case 3:
                maxElementInArray();
                break;
            case 4:
                sumArray();


        }
    }

    //14.print product
    public static void printproduct() {
        Scanner scObj = new Scanner(System.in);
        System.out.print("Enter the size of array you want to create:  ");
        int ArrayFiles = scObj.nextInt();
        int[] arr = new int[ArrayFiles];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < ArrayFiles; i++) {
            arr[i] = scObj.nextInt();
        }
        displayInputArray(arr);
        int product = 1;
        for (int i = 0; i < ArrayFiles; i++) {
            product = product * arr[i];
        }
        System.out.println("Product of all elements in the array: " + product);
    }

    //2.Write a Java program to find the minimum element in an array.
    public static void minElementInArray() {
        Scanner scObj = new Scanner(System.in);
        System.out.print("Enter the size of array you want to create:  ");
        int arraySize = scObj.nextInt();
        int[] arr = new int[arraySize];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arraySize; i++) {
            arr[i] = scObj.nextInt();
        }
        displayInputArray(arr);
        int minimumvalue = arr[0];
        for (int i = 1; i < arraySize; i++) {
            if (arr[i] < minimumvalue) {
                minimumvalue = arr[i];
            }
        }
        System.out.println("Minimum element in given array: " + minimumvalue);
    }
//1. Write a Java program to find the maximum element in an array.

    public static void maxElementInArray() {
        Scanner scObj = new Scanner(System.in);
        System.out.print("Enter the size of array you want to create:  ");
        int arraySize = scObj.nextInt();
        int[] arr = new int[arraySize];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arraySize; i++) {
            arr[i] = scObj.nextInt();
        }
        displayInputArray(arr);
        int maximumvalue =0;
        for (int i = 0; i < arraySize; i++) {
            if (arr[i] > maximumvalue) {
                maximumvalue = arr[i];
            }
        }
        System.out.println("Maximum element in the array: " + maximumvalue);
    }

    //Que:4)  Write a Java program to calculate the sum of all elements in an array.
    public static void sumArray() {
        Scanner scObj = new Scanner(System.in);
        System.out.print("Enter the size of array you want to create:  ");
        int arrayFiles = scObj.nextInt();
        int[] arr = new int[arrayFiles];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arrayFiles; i++) {
            arr[i] = scObj.nextInt();
        }
        displayInputArray(arr);
        int sum = 0;
        for (int i = 0; i < arrayFiles; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of array: "+ sum);
    }

    public static void displayInputArray(int[] inputArray) {
        System.out.print("Given input array is: [");
        for (int element : inputArray) {
            System.out.print(element+", ");
        }
        System.out.println("]");
    }

}