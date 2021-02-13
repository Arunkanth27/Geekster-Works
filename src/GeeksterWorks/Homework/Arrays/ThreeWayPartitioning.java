package GeeksterWorks.Homework.Arrays;

import GeeksterWorks.FastScanner;

import java.io.IOException;

public class ThreeWayPartitioning {
    public static void main(String[] args) throws IOException {
//        {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
        FastScanner fs = new FastScanner();
        int size = fs.nextInt();
        int[] arr= fs.nextIntArray(size);

        solve(arr, 14, 20);
    }

    private static void solve(int[] arr, int low, int high) {
        int start = 0;
        int end = arr.length - 1;

        for(int i = 0 ; i < end + 1 ;) {
            if(arr[i] < low) {
                int temp = arr[i];
                arr[i] = arr[start];
                arr[start] = temp;
                start++;
                i++;
            } else if(arr[i] > high){
                int temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
                end--;
            } else {
                i++;
            }
        }
        for(int i : arr) {
            System.out.print(i + " ");
        }

//        int[] result = new int[arr.length];
//        int lowsize = 0;
//        int midsize = 0;
//        int highsize = 0;
//        for(int i = 0 ; i < arr.length ; i++) {
//            if(arr[i] < low) {
//                lowsize += 1;
//            } else if(arr[i] > high) {
//                highsize += 1;
//            } else if(arr[i] >= low && arr[i] <= high) {
//                midsize += 1;
//            }
//        }
//        int[] lowarr = new int[lowsize];
//        int[] midarr = new int[midsize];
//        int[] higharr = new int[highsize];
//        int j = 0, k = 0, mid = 0;
//        for(int i : arr) {
//            if(i < low) {
//                lowarr[j++] = i;
//            } else if(i > high) {
//                higharr[k++] = i;
//            } else if(i >= low && i <= high) {
//                midarr[mid++] = i;
//            }
//        }
//
//        int l = 0;
//        j = 0;
//        k = 0;
//        mid = 0;
//        while(l < result.length) {
//            if(j < lowarr.length) {
//                result[l++] = lowarr[j++];
//            } else if(mid < midarr.length) {
//                result[l++] = midarr[mid++];
//            } else if(k < higharr.length) {
//                result[l++] = higharr[k++];
//            }
//        }

//        for(int i : result) {
//            System.out.print(i + " ");
//        }
    }
}
