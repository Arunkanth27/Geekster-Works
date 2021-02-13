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
        int[] result = new int[array.length];
        int temp = 0;
        for(int i = 0 ; i < array.length ; i++) {
            temp = 0;
            for(int j = i ; j <= 2 * i && j < array.length ; j++) {
                temp += array[j];
            }
            result[i] = temp;
        }

        return result;
    }
    
}
