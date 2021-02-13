package Homework.Arrays;

import Ruffle;

public class MakeArrayEqual {

    public static void main(String[] args) {
        int[] array = {2, 3, 3, 1, 2, 3};

        System.out.println(solve(array));
    }

    private static int solve(int[] array) {
        int len = array.length;
        int count = 1;
        int maxcount = 1;
        Ruffle.sort(array);
        for(int i = 1 ; i < len ; i++) {
            if(array[i - 1] == array[i]) {
                count += 1;
                maxcount = Math.max(maxcount, count);
            } else {
                count = 1;
            }
        }

        return len - maxcount;
    }
}
