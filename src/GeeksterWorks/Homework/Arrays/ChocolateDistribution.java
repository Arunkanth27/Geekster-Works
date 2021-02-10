package GeeksterWorks.Homework.Arrays;

import java.util.Arrays;

public class ChocolateDistribution {
    public static void main(String[] args) {
        int[] array = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;
//        int[] array = {3, 4, 1, 9, 56, 7, 9, 12};
//        int m = 5;
//        int[] array = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
//        int m = 7;
        System.out.println(solve(array, m));
    }

    //Sort Method --- Time -> O(N logN) Space -> O(1)

    private static int solve(int[] array, int m) {
        Arrays.sort(array);
        int i = 0;
        int j = m - 1;
        int mindiff = Integer.MAX_VALUE;
        for(; j < array.length ; j++) {
            mindiff = Math.min(mindiff, array[j] - array[i++]);
        }
        return mindiff;
    }
}
