package com.blz.javaprogramming;

public class CheckSpecificValue {
    public static void main(String[] args) {
        int[] arr = {11, 2, 3, 45, 6};
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 45){
                System.out.println("Array contain the Specific Value.");
            }
            else {
                System.out.println("Array does not contain the Specific Value.");
            }
        }
    }
}
