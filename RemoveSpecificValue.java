package com.blz.javaprogramming;

public class RemoveSpecificValue {
    public static void main(String[] args) {
        int[] arr = {11, 2, 3, 45, 6};
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 45){
                for(int j=i; j<arr.length-1; j++) {
                    arr[j]=arr[j+1];
                }
                break;
            }
        }
        for(int i=0; i<arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
