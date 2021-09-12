package com.javabegineer;

import java.util.Scanner;

public class gcdoftwono {
    public static void main(String args[])
    {
        int n1,n2,i,min,gcd=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers");
        n1=sc.nextInt();
        n2=sc.nextInt();
        min = (n1<n2)?n1:n2;

        for(i=1;i<=min;i++)
        {
            // Checks if i is factor of n1 &n2
            if(n1%i==0 && n2%i==0)
            {
                gcd = i;
            }
        }
        System.out.println("G.C.D of "+n1+" and "+n2+" = "+gcd);
    }
}
