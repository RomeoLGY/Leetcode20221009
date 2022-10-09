package class1;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util;

import java.util.Random;

public class Test1_DoubleNum {
    //1.唯一成对出现的数
    // A^A=0  A^0=A  1-2-k-k-1000 ^(1^2^3^..k^1000)  K^K^k 不会消去
    // 1. 1-2-k-k-1000---  x1=(x1^i);
    //2 ^(1^2^3^..k^1000) --  x1=x1^arr[i];
    public static void main(String[] args) {
        int N=3;
        int[] arr = new int[N];
        //最后一个数没写 N=3，只运行2个
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=i+1;
        }
        //1 最后一个数是随机数 +1原因是1到1000 ==  0是不可能出现
        arr[arr.length-1]= new Random().nextInt(N-1)+1;
        //2.随机下边
        int index= new Random().nextInt(N);
        swap(arr,index,arr.length-1);
        printf(arr);

        int x1=0;
        // 0-N  1-N-1
        for (int i = 1; i <=N-1 ; i++) {
            x1=(x1^i);

        }
      for (int i = 0; i < N; i++) {
            x1=x1^arr[i];

        }
        System.out.println(x1);
        System.out.println("======开辟数组空间出现一次+1，出现二次再+1，看谁+2就重复==========");
        int[] help = new int[N];
        for (int i = 0; i <N ; i++) {
            help[arr[i]]++;
        }
        for (int i = 0; i <N ; i++) {
            if(help[i]==2){
                System.out.println(i);
                break;
            }

        }
    }


    public static void printf(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int t = arr[j];
        arr[j] = arr[i]; //j位置的数，等于i位置的数
        arr[i] = t;
    }
}
