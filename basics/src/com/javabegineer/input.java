package com.javabegineer;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rollno = input.nextInt();
        String name = input.next();
        float per = input.nextFloat();
        System.out.println("Rollno :" + " " + rollno);
        System.out.println("Name :" + " " + name);
        System.out.println("Percentage :" + " " + per);


    }
}
