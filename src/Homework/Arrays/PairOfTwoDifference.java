package Homework.Arrays;

import java.util.HashMap;

public class PairOfTwoDifference {
    public static void main(String[] args) {
        int[] array = {5, 20, 3, 2, 50, 80};
        int target = 78;
//        int[] array = {90, 70, 20, 80, 50};
//        int target = 45;
        solve(array, target);
    }

    private static void solve(int[] array, int target) {
        // Using HashMap -- Time -> O(N) Space -> O(N)
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : array) {
            if(map.containsKey(Math.abs(i - target))) {
                System.out.println("The Pair is (" + Math.abs(i - target) + ", " + i + ")");
                return;
            } else {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }
        System.out.println("No Such Pair");

        // Using Sort Method -- Time -> O(N logN) Space -> O(1)

//        Arrays.sort(array);
//        int i = 0;
//        int j = array.length - 1;
//
//        while(i < j) {
//            if(Math.abs(array[i] - array[j]) == target) {
//                System.out.println("The Pair is (" + array[i] + ", " + array[j] + ")");
//                return;
//            } else if(Math.abs(array[i] - array[j]) > target) {
//                j--;
//            } else if(Math.abs(array[i] - array[j]) < target) {
//                i++;
//            }
//        }
//
//        System.out.println("No Such Pair");
    }
}
