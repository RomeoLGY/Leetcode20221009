package class1;

public class Test10_移动0_288 {
    public static void main(String[] args) {

    }
    // 方法1 双指针指向统一下标
    public static void moveZeroes(int [] nums){
        if(nums==null){
            return;
        }
        // 1. j 记录0的数量+ 改数 i遇到非0数 j 位置改数
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        // j 记录了几个0 ，就改几个0
        for (int i = j; i < nums.length; i++) {
            nums[i]=0;
        }
    }


}
