package com.blz.javaprogramming;

// Print the Pattern ( Palindromic Pattern )
//     1
//    212
//   32123
//  4321234
// 543212345

public class PalindromicPattern {
    public static void main(String[] args) {

        for(int i=0; i<5; i++) {
            for(int j=4-i; j>0; j--) {
                System.out.print(" ");
            }
            for(int k=i+1; k>0; k--) {
                System.out.print(k);
            }
            for(int n=0; n<i; n++) {
                System.out.print(n+2);
            }
            for(int m=4-i; m>0; m--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
