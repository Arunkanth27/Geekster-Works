package Homework.Arrays;

import java.util.*;

public class RearrangePositiveAndNegativeNumber {
    public static void main(String[] args){

        int[] arr = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        rearrange(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    private static void rearrange(int[] array) {
        int i = -1;
        int temp;
        int n = array.length;
        for(int j = 0 ; j < array.length ; j++) {
            if(array[j] < 0) {
                i++;
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int positive = i + 1;
        int negative = 0;

        while(positive < n && negative < positive && array[negative] < 0) {
            temp = array[negative];
            array[negative] = array[positive];
            array[positive] = temp;
            positive += 1;
            negative += 2;
        }
    }
}