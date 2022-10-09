package class1;

import java.util.HashMap;

public class Test8_70_ÅÀÂ¥Ìİ {

    public static void main(String[] args) {
        System.out.println("µİ¹éÏòÏÂ" + ClimbStairs(3));
        System.out.println("ÅÀ4²ãÂ¥Ìİ" + ClimbStairs(4));
        System.out.println("ÅÀ5²ãÂ¥Ìİ" + ClimbStairs(5));
        System.out.println("ÅÀ6²ãÂ¥Ìİ" + ClimbStairs(6));
        System.out.println("ÅÀ7²ãÂ¥Ìİ" + ClimbStairs(7));


        System.out.println("Ñ­»µÏòÉÏ"+ClimbStairs2(7));

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

    // ·½·¨1 £ºhaspmap+µİ¹é
    public static int ClimbStairs(int n) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        // Ö±½ÓÈ¥haspmap È¥ÕÒ ÕÒµ½ ·µ»Ø return map.get(n);
        if (null != map.get(n)) {
            return map.get(n);
        } else {
            // ÕÒ²»µ½µİ¹é
            int result = ClimbStairs(n - 1) + ClimbStairs(n - 2);
            map.put(n, result);
            return result;
        }
        
    }
    
    

}
