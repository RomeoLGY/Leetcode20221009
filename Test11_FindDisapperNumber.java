package class1;

import java.util.ArrayList;
import java.util.List;

public class Test11_FindDisapperNumber {

    public static void main(String[] args) {
        System.out.println(5%8);
    }
    public List<Integer> find(int[] nums) {
        int n = nums.length;
        for (int num : nums) {
            // 对n取模来还远出它本来的值
            // num 取出是 0号下标 的元素值
            // x 可以是index
            int x = (num - 1) % n;
            nums[x] =nums[x]+n;
        }

        List<Integer> result=new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            // 2.遍历集合，没有加n的数小于n，只要下标加1，就可以了
            if(nums[i]<n){
            result.add(i+1);
            }

        }
        return result;
    }

}
