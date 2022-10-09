package class1;

public class Test4_InsertSort {

    public static void main(String[] args) {

        int[] arr = {1, 3, 7, 9, 5, 2, 6, 4, 8, 12, 15, 1, 65, 2};
        printArray(arr);
        InsertSort(arr);
        printArray(arr);
    }

    private static void InsertSort(int[] arr) {
        //0-0
        //0-1
        //0-2
        for (int end = 0; end < arr.length; end++) {
            int newNum = end;
            while (newNum - 1 >= 0 && arr[newNum-1]>arr[newNum]){
                swap(arr,newNum-1,newNum);
                newNum--;
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

