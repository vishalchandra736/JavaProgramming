package com.blz.javaprogramming;

import java.util.Scanner;

public class AddTwoNumbers {
    public static int calculateSum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        int num1, num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number1 : ");
        num1 = scan.nextInt();
        System.out.println("Enter the Number2 : ");
        num2 = scan.nextInt();
        System.out.println("Sum is : " + calculateSum(num1,num2));
    }
}
