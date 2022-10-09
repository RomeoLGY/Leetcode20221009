package class1;

public class Test7_BinarySearch_TheleftNum {
    public static void main(String[] args) {

    }
    public static int theMostLeftNUm(int[] arr, int num) {
        int L = 0;
        int R = arr.length - 1;
        int ans = -1;
        while (L <= R){
            int mid=(L+R)/2;
            if(arr[mid]>=num){
                 ans=mid;
                 R=mid-1;
            }
            else{
                L=mid+1;
            }
        }
        return ans;
    }
}
