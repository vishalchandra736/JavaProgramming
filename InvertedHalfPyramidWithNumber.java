package com.blz.javaprogramming;

// Print the Pattern ( Inverted Half Pyramid with Number )
// 12345
// 1234
// 123
// 12
// 1

public class InvertedHalfPyramidWithNumber {
    public static void main(String[] args) {

        for(int i=5; i>0; i--) {
            for(int j=0; j<i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
