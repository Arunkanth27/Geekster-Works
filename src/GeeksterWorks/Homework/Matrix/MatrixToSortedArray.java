package GeeksterWorks.Homework.Matrix;

import java.util.*;

public class MatrixToSortedArray {
    public static void main(String[] args) {
        int[][] matrix = { {10, 20, 30, 40},
                           {15, 25, 35, 45},
                           {27, 29, 37, 48},
                           {32, 33, 39, 50}
        };

        int[] result = solve(matrix);

        for(int i : result) {
            System.out.print(i + " ");
        }

    }

    private static int[] solve(int[][] matrix) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int[] result = new int[matrix.length * matrix.length];

        for(int[] arr : matrix) {
            for(int i : arr) {
                heap.add(i);
            }
        }

        int i = 0;
        while(heap.size() > 0) {
            result[i++] = heap.poll();
        }

        return result;
    }
}
