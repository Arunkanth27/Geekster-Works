package GeeksterWorks.Homework.Arrays;

import java.util.Scanner;

public class EquillibriumIndexOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];

        for(int i = 0 ; i < size ; i++) {
            array[i] = sc.nextInt();
        }

        int result = solve(array);

        System.out.println(result);
    }

    private static int solve(int[] array) {
        int sum = 0;
        for(int k : array) {
            sum += k;
        }
        int leftsum = 0;

        for(int i = 0 ; i < array.length ; i++) {
            if(leftsum == sum - leftsum - array[i]) {
                return i;
            }
            leftsum += array[i];
        }

        return -1;
    }
}
