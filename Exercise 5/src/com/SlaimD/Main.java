package com.SlaimD;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please print a number y = ");
        int a = input.nextInt();
        System.out.println(sequenceSum(a));
        System.out.println(sequenceSum2(a));
        System.out.println(sequenceSum3(a));
        System.out.println("Please print a number y = ");
        int b = input.nextInt();
        System.out.println(sequenceSum(b));
        System.out.println("Please print a number y = ");
        int c = input.nextInt();
        System.out.println(sequenceSum(c));
        System.out.println("Please print a number y = ");
        int d = input.nextInt();
        System.out.println(sequenceSum(d));
        System.out.println("Please print a number y = ");
        int e = input.nextInt();
        System.out.println(sequenceSum(e));
    }

    public static double sequenceSum(int y){
        double sum = (1 + y)*y/2;
        return sum;
    }

    public static double sequenceSum2(int y){
        double x = 0;
        for (double i = 1; i <= y; i++){
            x = i + x;
        }
        return x;
    }

    public static double sequenceSum3(int y){
        double j = 1;
        double x = 0;
        while(j <= y){
            x = j + x;
            j++;
        }
        return x;
    }
}
