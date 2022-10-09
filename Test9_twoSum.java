package class1;

import java.util.HashMap;
import java.util.Map;

public class Test9_twoSum {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,8};
        twoSum3(arr,9);
    }
    // O(n^2)
    public static int[] twoSum(int[] arr, int target){
        int [] newArray=new int[2];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]+arr[j]==target){
                    newArray[0]=i;
                    newArray[i]=j;
                    return newArray;
                }
            }
        }
        return newArray;
    }

    public static int[] twoSum2(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int [] newArray=new int[2];
        for (int i = 0; i < arr.length; i++) {
            int another =target-arr[i];
            Integer anotherIndex=map.get(another);
            if(null!=anotherIndex){
                newArray[0]=anotherIndex;
                newArray[1]=i;
                break;
            }
            else{
                map.put(newArray[i],i);
            }
        }
        return newArray;
    }


    public static int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            //检查 key 为 1 是否存在
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }
}
