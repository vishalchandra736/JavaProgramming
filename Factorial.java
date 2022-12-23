package com.blz.javaprogramming;

import java.util.Scanner;

public class Factorial {
    public static int calculateFactorial(int num) {
        int fact = 1;
        for(int i=num; i>0; i--) {
           fact = fact * i;
       }
        return fact;
    }

    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        num = scan.nextInt();
        if( num < 0 ) {
            System.out.println("Invalid Input!!! Enter the Positive Number.");
        } else if ( num == 0 ) {
            System.out.println("Factorial of 0 is " + 1);
        } else {
            System.out.println("Factorial of " + num + " is : " + calculateFactorial(num));
        }
    }
}
