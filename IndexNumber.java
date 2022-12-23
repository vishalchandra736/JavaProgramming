package com.blz.javaprogramming;

public class IndexNumber {
    public static void main(String[] args) {
        int flag = 0, index = 0;
        int[] arr = {11, 2, 3, 45, 6};
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 45){
                flag = 1;
                index = i;
            }
        }
        if(flag == 1) {
            System.out.println("Array Index number is : " + index);
        }
        else {
            System.out.println("Invalid Input!!!");
        }
    }
}