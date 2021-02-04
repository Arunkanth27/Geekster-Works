package Homework.Arrays;

import java.util.Scanner;

public class SubArraysWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] array = new int[size];

        for(int i = 0 ; i < size ; i++) {
            array[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        solve(array, target);
    }

    private static void solve(int[] array, int target) {

    }


}
