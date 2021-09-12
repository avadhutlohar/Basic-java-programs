package com.javabegineer;

import java.util.Scanner;

public class multi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int res=0;
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        for(int i = 1; i <= 10; i++)
        {
            res = n * i;
            System.out.println(n + " * " + i + " = " + res);
        }

    }
}
