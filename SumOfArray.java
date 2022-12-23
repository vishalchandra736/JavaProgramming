package com.blz.javaprogramming;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {11, 2, 3, 45, 6};
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of all elements of array is : " + sum);
    }
}
