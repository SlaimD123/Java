package com.SlaimD;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your salary: ");
        float salary = scanner.nextFloat();
        float tax = 0;

        if (salary >= 15000) {
            tax = (salary-15000) * 0.1F + 5000 * 0.05F;
            System.out.println("The tax you should pay is:" + tax);
        } else if (salary >= 10000) {
            tax = salary * 0.05F;
            System.out.println("The tax you should pay is:" + tax);
        } else
            System.out.println("The tax you should pay is:" + tax);
    }
}
