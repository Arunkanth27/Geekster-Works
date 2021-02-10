package GeeksterWorks.Homework.Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] array = {2, 0, 2};
//        int[] array = {3, 0, 2, 0, 4};
//        int[] array = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(solve(array));
    }

    private static int solve(int[] array) {
        int[] leftmax = new int[array.length];
        int[] rightmax = new int[array.length];

        leftmax[0] = array[0];
        rightmax[array.length - 1] = array[array.length - 1];

        for(int i = 1 ; i < leftmax.length ; i++) {
            leftmax[i] = Math.max(array[i], leftmax[i - 1]);
        }

        for(int i = rightmax.length - 2 ; i >= 0 ; i--) {
            rightmax[i] = Math.max(array[i], rightmax[i + 1]);
        }
        int result = 0;
        for(int i = 0 ; i < array.length ; i++) {
            int min = Math.min(leftmax[i], rightmax[i]);

            if(min > array[i]) {
                result += min - array[i];
            }

        }

        return result;
    }
}
