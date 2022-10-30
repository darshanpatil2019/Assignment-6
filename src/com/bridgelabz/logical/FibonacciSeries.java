package com.bridgelabz.logical;

import java.util.Scanner;

public class FibonacciSeries {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int num = sc.nextInt();
            int a = 0;
            int b = 1;
            int c = 2;
            int sum;
            System.out.print(a + " " + b + " ");
            while( c < num ) {
                sum = a + b;
                System.out.print(sum + " ");
                a = b;
                b = sum;
                c++;
            }
        }
    }

