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
            // ��nȡģ����Զ����������ֵ
            // num ȡ���� 0���±� ��Ԫ��ֵ
            // x ������index
            int x = (num - 1) % n;
            nums[x] =nums[x]+n;
        }

        List<Integer> result=new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            // 2.�������ϣ�û�м�n����С��n��ֻҪ�±��1���Ϳ�����
            if(nums[i]<n){
            result.add(i+1);
            }

        }
        return result;
    }

}
