package com.SlaimD;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       int[] a = new int[5];
       int max = 0;
       int min = 0;
       Scanner input = new Scanner(System.in);
       System.out.println("Please enter the first number: ");
       a[0] = input.nextInt();
       System.out.println("Please enter the second number: ");
       a[1] = input.nextInt();
       System.out.println("Please enter the third number: ");
       a[2] = input.nextInt();
       System.out.println("Please enter the fourth number: ");
       a[3] = input.nextInt();
       System.out.println("Please enter the fifth number: ");
       a[4] = input.nextInt();
       max = a[0];
       min = a[0];
       if (a[0] > max)
           max = a[0];
       if (a[1] > max)
           max = a[1];
       if (a[2] > max)
           max = a[2];
       if (a[3] > max)
           max = a[3];
       if (a[4] > max)
           max = a[4];
       if (a[0] < min)
           min = a[0];
        if (a[1] < min)
            min = a[1];
        if (a[2] < min)
            min = a[2];
        if (a[3] < min)
            min = a[3];
        if (a[4] < min)
            min = a[4];
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
