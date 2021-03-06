package Day12;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {10, 80, 20, 30, 90, 70};
        quicksort(array);
        for(int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void quicksort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    private static void quicksort(int[] array, int low, int high) {
        if(low < high) {
            int pivotidx = partition(array, low, high);
            quicksort(array, low, pivotidx - 1);
            quicksort(array, pivotidx + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for(int j = low ; j < high ; j++) {
            if(array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
