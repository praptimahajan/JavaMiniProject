package org.byteqore;


import java.util.Scanner;

public class ArrayOperations {
    public ArrayOperations() {
        System.out.println("Kindly select the topic you need to perform ArrayOperations: ");
        System.out.println("\n1.PrintProduct: "+"\n2.minArray: "+"\n3.maxArray: "+"\n4.sumArray: ");

        Scanner scannerObj = new Scanner(System.in);
        int choice = scannerObj.nextInt();
        switch (choice) {
            case 1:
                printproduct();
                break;
            case 2:
                minArray();
                break;
            case 3:
                maxArray();
                break;
            case 4:
                sumArray();


        }
    }

    //14.print product
    public static void printproduct() {
        Scanner scObj = new Scanner(System.in);
        System.out.println("Enter the size of elements in the array: ");
        int ArrayFiles = scObj.nextInt();
        int[] arr = new int[ArrayFiles];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < ArrayFiles; i++){
            arr[i] = scObj.nextInt();
         }
        int product = 1;
        for(int i = 0; i<ArrayFiles; i++){
        product = product * arr[i];
        }
       System.out.println("Product of all elements in the array: " + product);
}

//2.Write a Java program to find the minimum element in an array.
  public static void minArray() {
      Scanner scObj = new Scanner(System.in);
      System.out.println("Enter the elements in the array: ");
      int arrayFiles = scObj.nextInt();
      int[] arr = new int[arrayFiles];
      System.out.println("Enter the elements: ");
      for(int i =0;i <arrayFiles;i++){
          arr[i]=scObj.nextInt();
      }
      int minimumvalue=0;
      for(int i = 0;i<arrayFiles;i++){
  if (arr[i] < minimumvalue) {
      minimumvalue = arr[i];
          }
          System.out.println("Minimum element in the array: " + minimumvalue);
      }//else{
          //System.out.println("not the minimum elementt");
      }
//1. Write a Java program to find the maximum element in an array.

    public static void maxArray() {
        Scanner scObj = new Scanner(System.in);
        System.out.println("Enter the elements in the array: ");
        int arrayFiles = scObj.nextInt();
        int[] arr = new int[arrayFiles];
        System.out.println("Enter the elements: ");
        for(int i =0;i <arrayFiles;i++){
            arr[i]=scObj.nextInt();
        }
        int maximumvalue=0;
        for(int i = 0;i<arrayFiles;i++){
            if (arr[i] > maximumvalue) {
                maximumvalue = arr[i];
            }
            System.out.println("Minimum element in the array: " + maximumvalue);
        }//else{
        //System.out.println("not the minimum elementt");
    }
//Que:4)  Write a Java program to calculate the sum of all elements in an array.
    public static void sumArray() {
        Scanner scObj = new Scanner(System.in);
        System.out.println("Enter the elements in the array: ");
        int arrayFiles = scObj.nextInt();
        int[] arr = new int[arrayFiles];
        System.out.println("Enter the elements: ");
        for(int i =0;i <arrayFiles;i++) {
            arr[i] = scObj.nextInt();
        }
        int sum = 0;
        for(int i = 0;i<arrayFiles;i++){;
            sum = sum + arr[i];


        }

  }}