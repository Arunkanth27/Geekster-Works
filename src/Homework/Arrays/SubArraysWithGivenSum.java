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
        int[] prefixsum = new int[array.length];

        for(int i = 0 ; i < array.length ; i++) {
            if(i == 0) {
                prefixsum[i] = array[i];
            } else {
                prefixsum[i] = array[i] + prefixsum[i - 1];
            }
        }

//        for(int i : prefixsum) {
//            System.out.print(i + " ");
//        }

        int i = 0, j = prefixsum.length - 2;
        int val = prefixsum[prefixsum.length - 1];

        while(i < j) {
            if(val == target) {
                break;
            }

            if(val > target) {
                if(prefixsum[j] < target) {
                    val -= array[i];
                    i++;
                } else {
                    val = prefixsum[j];
                    j--;
                }
            }
        }

        if(val == target) {
            System.out.println("The Subarray " + i + " to " + (j + 1) + " contains the target value.");
        } else {
            System.out.println("No Match Found");
        }
    }


}
