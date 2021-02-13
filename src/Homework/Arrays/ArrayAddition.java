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

        return null;
    }
    
}
