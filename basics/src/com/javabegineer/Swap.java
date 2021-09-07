package com.javabegineer;

public class Swap {
    public static void main(String[] args) {
      /*
      //With TEMP
        int a = 20;
        int b = 80;
        int temp;
        System.out.println("Before Swapping : " + "a = " + a + " b = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping : " + "a = " + a + " b = " + b);*/
        // Without Temp
        int a = 20;
        int b = 80;

        System.out.println("Before Swapping : " + "a = " + a + " b = " + b);
        a = a+b;// 20 + 80 = 100
        b = a-b;// 100- 80 = 20
        a = a-b;// 100 * 20 = 80
        System.out.println("After Swapping : " + "a = " + a + " b = " + b);

    }
}
