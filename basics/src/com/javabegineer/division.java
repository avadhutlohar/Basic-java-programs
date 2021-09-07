package com.javabegineer;

import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int num1 = number.nextInt();
        int num2 = number.nextInt();
        int div;
        int rem;
        div = num1/num2;
        rem = num1%num2;
        System.out.println("Divisor =" + " " + div);
        System.out.println("Remainder =" + " " + rem);

    }
}
