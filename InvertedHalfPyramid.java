package com.blz.javaprogramming;

// Print the Pattern ( Inverted Half Pyramid )
// ****
// ***
// **
// *

public class InvertedHalfPyramid {
    public static void main(String[] args) {

        for(int i=4; i>0; i--) {
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
