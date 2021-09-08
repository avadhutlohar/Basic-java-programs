package com.javabegineer;

import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);

        System.out.print("Enter A :");
        int a = no.nextInt();
        System.out.print("Enter B :");
        int b = no.nextInt();
        System.out.print("Enter C :");
        int c = no.nextInt();

        if(a>b && a>c)
        {
            System.out.println(a + " A is Greater");
        }
        else if(b>a && b>c)
        {
            System.out.println(b + " B is Greater");
        }
        else
        {
            System.out.println(c + " C is Greater");
        }
    }
}
