package com.javabegineer;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int no = input.nextInt();
        int i ;
        int fact = 1;
        if(no<0)
        {
            System.out.println("Error! Factorial of a negative number dose not exist");
        }
        else
        {

            for(i=1; i<=no; i++)
            {
                fact = fact * i;
            }
            System.out.println("Factorial of "+ no + " is "+fact);
        }

    }
}
