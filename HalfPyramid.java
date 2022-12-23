package com.blz.javaprogramming;

// Print the Pattern ( Half Pyramid )
// *
// **
// ***
// ****

public class HalfPyramid {
    public static void main(String[] args) {

        for(int i=0; i<4; i++) {
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
