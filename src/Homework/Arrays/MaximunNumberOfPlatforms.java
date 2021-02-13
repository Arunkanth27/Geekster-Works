package Homework.Arrays;

import java.util.Arrays;

public class MaximunNumberOfPlatforms {
    public static void main(String[] args) {
        int[] arrival = { 900, 940, 950, 1100, 1500, 1800 };
        int[] departure = { 910, 1200, 1120, 1130, 1900, 2000 };
        int result = solve(arrival, departure);
        System.out.println(result);
    }

    // Sort Method -- Time -> O(n logN) Space -> O(1)

    private static int solve(int[] arr, int[] dep) {
        int n = arr.length;
        int platforms = 1;
        int result = 1;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 1, j = 0;
        while(i < n && j < n) {
            if(arr[i] <= dep[j]) {
                platforms += 1;
                i++;
            } else if(arr[i] > dep[j]) {
                platforms -= 1;
                j++;
            }

            result = Math.max(platforms, result);

        }

        return result;
    }
}
