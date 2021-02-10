package GeeksterWorks.Homework.Arrays;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] arr = {6, -3, -10, 0, 2};

        int result = solve(arr);

        System.out.println(result);
    }

    private static int solve(int[] array) {
        if (array.length == 0)
            return 0;
        int minimum = array[0];
        int maximum = array[0];
        int max = maximum;
        for (int i = 1; i < array.length; i++) {
            int temp = maximum;
            maximum = Math.max(Math.max(maximum * array[i], array[i]), minimum * array[i]);
            minimum = Math.min(temp * array[i], Math.min(minimum * array[i], array[i]));
            if (maximum > max) {
                max = maximum;
            }
        }
        return max;
    }
}
