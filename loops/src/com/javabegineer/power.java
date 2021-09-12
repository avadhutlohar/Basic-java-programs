package com.javabegineer;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int no1, no2, i, ans=1;
        System.out.println("Enter any two numbers ");
        no1 = reader.nextInt();
        no2 = reader.nextInt();
        // we wanted to find out no1 raised to no2
        for(i=1;i<=no2;i++)
        {
            ans=ans*no1;
        }
        System.out.print(no1 +" raised to "+ no2 +" is " + ans);
    }
}
