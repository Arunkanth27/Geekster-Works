package Stack_Questions;

import FastScanner.FastScanner;

import java.io.IOException;

public class CelebrityProblem {
    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int[][] matrix = fs.nextIntMatrix(n,n);
        int result = solve(matrix);
        System.out.println(result);
    }

    public static int solve(int[][] matrix) {
        int count = 0;
        int maxcount = 0;
        int maxidx = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0 ; j < matrix.length ; j++) {
                if (i != j) {
                    if (matrix[i][j] == 0 && matrix[j][i] == 1) {
                        count += 1;
                    } else {
                        break;
                    }
                }
            }
            if (count > maxcount) {
                maxidx = i;
                maxcount = count;
                count = 0;
            }
        }
        return maxcount == matrix.length - 1 ? maxidx : -1;
    }
}
