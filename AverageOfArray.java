package com.blz.javaprogramming;

public class AverageOfArray {
    public static void main(String[] args) {
        int[] arr = {11, 2, 3, 45, 6};
        int sum = 0, avg;
        for(int i=0; i<arr.length; i++) {
            sum = sum + arr[i];
        }
        avg = sum / arr.length;
        System.out.println("Sum of all elements of array is : " + avg);
    }
}
