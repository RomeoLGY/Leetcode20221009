package class1;

public class Test6_BinarySearch {

    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArray(arr);
       int index= BinarySearch(arr,5);
        System.out.println(index);

    }

    private static int BinarySearch(int[] arr, int num) {
        int L = 0;
        int R = arr.length - 1;
        while (L <= R){
           int mid=(L+R)/2;
           if(arr[mid]==num){
               return L;
           }
           else if(arr[mid]<num){
               L=mid+1;
           }
          else if(arr[mid]>num){
              R=mid-1;

            }
        }
        return L;
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
