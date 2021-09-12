package com.javabegineer;

import java.util.Scanner;

public class factor {
    public static void findFactor(int n) {
        for(int i=1; i <= n; i++) {
            if(n % i == 0)
                System.out.print(i+"\t");
        }
    }

    public static void main(String[] args) {

        // declare variable
        int number = 0;

        // create Scanner class object
        Scanner scan = new Scanner(System.in);

        // take input
        System.out.print("Enter a number:: ");
        number = scan.nextInt();

        // find the factor of the number
        System.out.print("The factors are:: ");
        findFactor(number);

        // close Scanner class object
        scan.close();

    }
}
