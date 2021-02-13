package Homework.Arrays;

import java.util.Arrays;

public class MaxSumArrayToSort {
    public static void main(String[] args) {
        int[] array = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
        solve(array);
    }

    public static void solve(int[] arr) {
        int[] sortedarr = arr.clone();
        Arrays.sort(sortedarr);

        int left = 0;
        int right = arr.length - 1;

        while(sortedarr[left] == arr[left] && left < arr.length) {
            left += 1;
        }

        while(sortedarr[right] == arr[right] && right >= 0) {
            right -= 1;
        }

        System.out.println(left + " " + right);
    }
}
