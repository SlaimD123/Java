package com.SlaimD;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int number = 1;
    int height = 0;
    Scanner input = new Scanner(System.in);
    height = input.nextInt();
    for (int n = 0; n < height; n++){
        for (int x = height-n; x > 0; x--){
            System.out.print(" ");
        }

        int N2 = 2*n+number;
        for (int m = 1; m <= N2; m++){
            System.out.print("*");
        }
        System.out.print("\n");
    }

    }
}
