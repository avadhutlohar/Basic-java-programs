package com.javabegineer;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int num1 = number.nextInt();
        int num2 = number.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum =" + " " + sum);

    }
}
