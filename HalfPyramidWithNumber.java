package com.blz.javaprogramming;

// Print the Pattern ( Half Pyramid With Number )
// 1
// 12
// 123
// 1234
// 12345

public class HalfPyramidWithNumber {
    public static void main(String[] args) {

        for(int i=0; i<5; i++) {
            for(int j=0; j<i+1; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
