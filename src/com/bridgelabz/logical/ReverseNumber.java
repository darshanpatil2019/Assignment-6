package com.bridgelabz.logical;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter a number to check its reverse");
        int num = sc.nextInt();
        int reverse = 0;
        while (num != 0) {
            int i = num % 10;
            reverse = reverse * 10 + i;
            num = num / 10;
        }
        System.out.println("The reversed number is: " + reverse);
    }
}

