package com.javabegineer;

import java.util.Scanner;

public class multiplyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float mul;
        mul = a * b;
        System.out.println("Multiplication : " + mul );
    }
}
