package Homework.Arrays;

public class Maximum_Length_Bitonic_Subarray {
    public static void main(String[] args) {
        int[] array = {12, 4, 78, 90, 45, 23};
        System.out.println(solve(array));
    }

    private static int solve(int[] array) {
        if(array.length <= 1) {
            return array.length;
        }
        int[] inc = new int[array.length];
        int[] dec = new int[array.length];

        inc[0] = 1;
        dec[array.length - 1] = 1;

        for(int i = 1 ; i < array.length ; i++) {
            inc[i] = (array[i] >= array[i - 1]) ? inc[i - 1] + 1 : 1;
        }

        for(int i = array.length - 2 ; i >= 0 ; i--) {
            dec[i] = (array[i] >= array[i + 1]) ? dec[i + 1] + 1 : 1;
        }

        int max = inc[0] + dec[0] - 1;
        for (int i = 1; i < array.length ; i++) {
            int i1 = inc[i] + dec[i] - 1;
            if (i1 > max)
                max = i1;
        }

        return max;
    }
}
