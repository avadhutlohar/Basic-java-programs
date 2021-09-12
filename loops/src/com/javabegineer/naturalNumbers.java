package com.javabegineer;

import java.util.Scanner;

public class naturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a Number : ");
        int no = input.nextInt();
        for (int i = 1; i <= no ; ++i)
        {
           sum = sum + i;
        }

        System.out.println("Sum = " + sum );
    }
}
