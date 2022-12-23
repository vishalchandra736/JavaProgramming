package com.blz.javaprogramming;

// Print the Pattern ( Number Pyramid )
//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5

public class NumberPyramid {
    public static void main(String[] args) {
        int n = 1;
        for(int i=0; i<5; i++) {
            for(int j=4-i; j>0; j--) {
                System.out.print(" ");
            }
            for(int k=0; k<i+1; k++){
                System.out.print(n + " ");
            }
            System.out.println();
            n++;
        }
    }
}
