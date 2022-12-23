package com.blz.javaprogramming;

// Print the Pattern ( Inverted Half Pyramid - rotated by 180 deg )
//    *
//   **
//  ***
// ****

public class RotatedInvertedHalfPyramid {
    public static void main(String[] args) {

        for(int i=0; i<4; i++) {
            for(int j=3-i; j>0; j--) {
                System.out.print(" ");
            }
            for(int k=0; k<i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
