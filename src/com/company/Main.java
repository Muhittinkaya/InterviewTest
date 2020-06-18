package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        //First question
        //Example array
        int exArray[] = {1,2,3,5,8,9,6,7,1,12,45,2,78,55,21,47};
        System.out.println("The maximum sum of subsets in given array: " +FindMax(exArray));

        //Second question
        System.out.println("The sum of divisibles " + Divisible());

    }

    public static int FindMax(int Array[]){

        if(Array.length == 1){
            return Array[0];
        }

        int prevofprevious = Array[0];
        int previous = Integer.max(Array[0],Array[1]);

        for(int i = 2; i < Array.length; i++){

            int current = Integer.max(Array[i],Integer.max(previous,prevofprevious + Array[i]));
            prevofprevious = previous;
            previous = current;
        }

        return previous;

    }

    public static int Divisible(){

        System.out.println("Enter first number to start");
        int start = input.nextInt();
        System.out.println("Enter second number to start");
        int finish = input.nextInt();
        System.out.println("Enter the number to divide");
        int divisor = input.nextInt();

        int sum = 0;
        for (int i = start; i <= finish; i++){
            if((i % divisor) == 0){
                sum += i;
            }
        }
        return sum;
    }
}
