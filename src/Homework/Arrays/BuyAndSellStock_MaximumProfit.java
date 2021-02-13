package Homework.Arrays;

public class BuyAndSellStock_MaximumProfit {
    public static void main(String[] args) {
        int[] array = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(solve(array));
    }

    private static int solve(int[] array) {
        int profit = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i < array.length ; i++) {
            if(array[i] < min) {
                min = array[i];
            } else {
                profit += array[i] - min;
                min = array[i];
            }
        }

        return profit;
    }
}
