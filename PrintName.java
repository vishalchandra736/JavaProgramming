package com.blz.javaprogramming;

import java.util.Scanner;

public class PrintName {
    public static void myName(String name) {
        System.out.println("Your Name is : " + name);
        return;
    }

    public static void main(String[] args) {
        String name;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        name = scan.nextLine();
        myName(name);
    }
}
