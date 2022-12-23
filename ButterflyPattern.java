package com.blz.javaprogramming;

// Print the Pattern ( Butterfly Pattern)
// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *

public class ButterflyPattern {
    public static void main(String[] args) {

        for(int i=0; i<4; i++) {
            for(int j=0; j<i+1; j++) {
                System.out.print("*");
            }
            for(int k=6-i*2; k>0; k--) {
                System.out.print(" ");
            }
            for(int m=0; m<i+1; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int u=0; u<4; u++) {
            for(int v=4-u; v>0; v--) {
                System.out.print("*");
            }
            for(int w=0; w<u*2; w++) {
                System.out.print(" ");
            }
            for(int x=4-u; x>0; x--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
