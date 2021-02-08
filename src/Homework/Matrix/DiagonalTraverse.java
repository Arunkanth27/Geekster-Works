package Homework.Matrix;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class DiagonalTraverse {
    public static void main(String[] args) {
        int[][] matrix =  { {1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12},
                            {13, 14, 15, 16},
                            {17, 18, 19, 20},
        };

        ArrayList<ArrayList<Integer>> result = solve(matrix);
        for(ArrayList<Integer> list : result) {
            System.out.println(list);
        }
    }

    private static ArrayList<ArrayList<Integer>> solve(int[][] matrix) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<>();
        int N = matrix.length;
        int M = matrix[0].length;

        for(int d = 0 ; d < N + M- 1 ; d++){

            list.clear();

            int r = d < M ? 0 : d - M + 1;
            int c = d < M ? d : M - 1;

            while (r < N && c > -1) {
                list.add(matrix[r][c]);
                ++r;
                --c;
            }

            ArrayList<Integer> copyList = (ArrayList<Integer>)list.clone();
            Collections.reverse(copyList);
            result.add(copyList);

        }
        return result;
    }
}
