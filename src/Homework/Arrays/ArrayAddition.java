package Homework.Arrays;

import FastScanner.FastScanner;

import java.io.*;

public class ArrayAddition {
    public static void main(String[] args) throws IOException{

        FastScanner fs = new FastScanner();
        int size = fs.nextInt();
        int[] array = fs.nextIntArray(size);
        int[] result = solve(array);
        for(int i : result) {
            System.out.print(i + " ");
        }

    }

    private static int[] solve(int[] array) {
        int[] prefixsum = new int[array.length];
        prefixsum[0] = array[0];
        for(int i = 1 ; i < array.length ; i++) {
            prefixsum[i] = prefixsum[i - 1] + array[i];
        }
        int[] result = new int[array.length];
        result[0] = array[0];
        int mid = array.length / 2;
        int k = 1;
        int count = 1;
        for(int i = 1 ; i < array.length - 1 ; i++) {
            if(i < mid) {
                result[k++] = prefixsum[i + count] - prefixsum[i - 1];
                count += 1;
            } else {
                count -= 1;
                result[k++] = prefixsum[i + count] - prefixsum[i - 1];
            }
        }
        result[k] = prefixsum[array.length - 1] - prefixsum[array.length - 2];

        return result;
    }
    
}
