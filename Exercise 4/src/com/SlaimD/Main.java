package com.SlaimD;

public class Main {


    public static void main(String[] args) {
        int[] a1 = {1, 3, 19, 33, 49, 24, 20};
        int[] a2 = {10, 8, 3, 0, 11, 22, 44, -50};
        System.out.println(arraySum(a1, a1.length));
        System.out.println(arraySum(a2, a2.length));
        int as1 = arraySum(a1, a1.length);
        int as2 = arraySum(a2, a2.length);
        if(as1 > as2){
            System.out.println("The sum of a1 is bigger than a2.");
        }
        else{
            System.out.println("The sum of a2 is bigger than a1.");
        }
    }
    public static int arraySum(int[] a, int arrayLength){
        int as = 0;
        for(int i : a){
            as = i + as;
        }
        return as;
    }
}