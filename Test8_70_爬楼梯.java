package class1;

import java.util.HashMap;

public class Test8_70_��¥�� {

    public static void main(String[] args) {
        System.out.println("�ݹ�����" + ClimbStairs(3));
        System.out.println("��4��¥��" + ClimbStairs(4));
        System.out.println("��5��¥��" + ClimbStairs(5));
        System.out.println("��6��¥��" + ClimbStairs(6));
        System.out.println("��7��¥��" + ClimbStairs(7));


        System.out.println("ѭ������"+ClimbStairs2(7));

    }

    private static int ClimbStairs2(int n) {
        int sum=0;
        int prepre=1;
        int pre=2;
        for (int i = 3; i <= n; i++) {
            sum=pre+prepre;
            prepre=pre;
            pre=sum;
        }
        return sum;
    }

    // ����1 ��haspmap+�ݹ�
    public static int ClimbStairs(int n) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        // ֱ��ȥhaspmap ȥ�� �ҵ� ���� return map.get(n);
        if (null != map.get(n)) {
            return map.get(n);
        } else {
            // �Ҳ����ݹ�
            int result = ClimbStairs(n - 1) + ClimbStairs(n - 2);
            map.put(n, result);
            return result;
        }
        
    }
    
    

}
