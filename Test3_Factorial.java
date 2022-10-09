package class1;

public class Test3_Factorial {
    // 1！+2！+。。+N！
    //4！=1*2*3*4  3！*4

    public static void main(String[] args) {
        //System.out.println(f1(5));
        System.out.println(f2(5));
    }
    //方法1
    public static long f1(int N) {
        //累加阶乘
        long ans=0;
        for (int j = 0; j <=N; j++) {
            ans=ans+fac(j);
        }
        return ans;
    }
    // 算阶乘具体的数
    public static long fac(int N){
        long ans=1;
        for (int i = 1; i <=N ; i++) {
            ans*=i;
        }
        return ans;
    }

// 方法二 提前存储
    public static long f2(int N){
        long ans=0,cur=1;
        for (int i = 1; i <= N; i++) {
            cur*=i;
            ans+=cur;
        }
        return  ans;
    }
}
