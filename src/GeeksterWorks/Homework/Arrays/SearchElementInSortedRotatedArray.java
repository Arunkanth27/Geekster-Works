package GeeksterWorks.Homework.Arrays;

import java.util.*;

public class SearchElementInSortedRotatedArray {
    public static void main (String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int[] result = new int[testCase];
        for(int t = 0 ; t < testCase ; t++) {
            int size = sc.nextInt();
            int[] array = new int[size];

            for(int i = 0 ; i < size ; i++) {
                array[i] = sc.nextInt();
            }

            int k = sc.nextInt();

            result[t] = solve(array, k);
        }

        for(int i = 0 ; i < testCase ; i++) {
            System.out.println(result[i]);
        }

    }

    public static int solve(int[] array, int k) {
        int n = array.length;
        int pivot = findPivot(array, 0, n - 1);

        if(pivot == -1){
            return binarySearch(array, 0, n - 1, k);
        }

        if(array[pivot] == k) {
            return pivot;
        }

        if(array[0] <= k) {
            return binarySearch(array, 0, pivot - 1, k);
        }

        return binarySearch(array, pivot + 1, n - 1, k);
    }

    public static int findPivot(int[] array, int low, int high) {
        if(high < low) {
            return -1;
        }

        if(low == high) {
            return low;
        }

        int mid = (low + high) / 2;

        if(mid < high && array[mid] > array[mid + 1]){
            return mid;
        }

        if(mid > low && array[mid] < array[mid - 1]) {
            return mid - 1;
        }

        if(array[low] >= array[mid]) {
            return findPivot(array, low, mid - 1);
        }

        return findPivot(array, mid + 1, high);
    }

    public static int binarySearch(int[] array, int low, int high, int k) {
        if(high < low) {
            return -1;
        }

        int mid = (low + high) / 2;

        if(array[mid] == k) {
            return mid;
        }

        if(k > array[mid]) {
            return binarySearch(array, (mid + 1), high, k);
        }

        return binarySearch(array, low, (mid - 1), k);
    }
}
