package class1;

public class Test10_�ƶ�0_288 {
    public static void main(String[] args) {

    }
    // ����1 ˫ָ��ָ��ͳһ�±�
    public static void moveZeroes(int [] nums){
        if(nums==null){
            return;
        }
        // 1. j ��¼0������+ ���� i������0�� j λ�ø���
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        // j ��¼�˼���0 ���͸ļ���0
        for (int i = j; i < nums.length; i++) {
            nums[i]=0;
        }
    }


}
