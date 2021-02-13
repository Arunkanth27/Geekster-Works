package Homework.SortingAndSearching;

import java.io.IOException;

public class MajorityElement {
    public static void main(String[] args) throws IOException {
        // FastScanner fs = new FastScanner();
        // int size = fs.nextInt();
        // int[] array = fs.nextIntArray(size);
        int[] array = {3, 3, 4, 2, 4, 4, 2, 4};
        int result = solve(array);
        System.out.println(result != -1 ? result : "No Majority Vote");
    }

    private static int solve(int[] array) {
        int majority = array[0];
        int count = 1;
        for(int j = 1 ; j < array.length ; j++) {
            int val = array[j];
            if(val == majority) {
                count += 1;
            } else {
                count -= 1;
            }
            if(count == 0) {
                majority = val;
                count = 1;
            }
        }
        count = 0;
        for(int i : array) {
            if(i == majority) {
                count += 1; 
            }
        }

        if(count > array.length / 2) {
            return majority;
        } else{
            return -1;
        }
    }
}
