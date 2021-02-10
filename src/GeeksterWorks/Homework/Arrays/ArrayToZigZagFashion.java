package GeeksterWorks.Homework.Arrays;

public class ArrayToZigZagFashion {
    public static void main(String[] args) {
        int[] array = {4, 3, 7, 8, 6, 2, 1};
//        int[] array = {1, 4, 3, 2};
        solve(array);
        for(int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void solve(int[] array) {
        boolean flag = true;

        for (int i = 0; i < array.length - 1; i++) {
            if(flag && (array[i] > array[i + 1])){
                swap(array, i, i + 1);
            } else if(!flag && (array[i] < array[i + 1])) {
                swap(array, i, i + 1);
            }

            flag = !flag;
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
