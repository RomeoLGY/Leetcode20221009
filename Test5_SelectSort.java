package class1;

public class Test5_SelectSort {

    public static void main(String[] args) {

        int[] arr = {1,3,7,9,5,2,6,4,8,12,15,1,65,2};
        printArray(arr);
        selectSort(arr);
        printArray(arr);
    }

    private static void selectSort(int[] arr) {
        //1.·Ç¿Õ
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            //0-n-1
            //1-n-1
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                min = arr[j] < arr[min] ? j : min;
            }
            swap(arr,i,min);

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



