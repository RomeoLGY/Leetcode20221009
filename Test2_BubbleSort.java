package class1;

public class Test2_BubbleSort {
    public static void main(String[] args) {

        int[] arr = {1, 3, 7, 9, 5, 2, 6, 4, 8, 12, 15, 1, 65, 2};
        printArray(arr);
        BubbleSort(arr);
        printArray(arr);
    }

    private static void BubbleSort(int[] arr) {
        //1.·Ç¿Õ
        if (arr == null || arr.length < 2) {
            return;
        }
        //0-n-1
        //0-n-2
        for (int end = arr.length - 1; end >= 0; end--) {

            // 0 1 12 23
            for (int i = 1; i <= end; i++) {
                if (arr[i - 1] > arr[i]) {
                    swap(arr, i - 1, i);
                }

            }

        }
    }


    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

}
