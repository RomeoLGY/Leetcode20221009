package class1;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util;

import java.util.Random;

public class Test1_DoubleNum {
    //1.Ψһ�ɶԳ��ֵ���
    // A^A=0  A^0=A  1-2-k-k-1000 ^(1^2^3^..k^1000)  K^K^k ������ȥ
    // 1. 1-2-k-k-1000---  x1=(x1^i);
    //2 ^(1^2^3^..k^1000) --  x1=x1^arr[i];
    public static void main(String[] args) {
        int N=3;
        int[] arr = new int[N];
        //���һ����ûд N=3��ֻ����2��
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=i+1;
        }
        //1 ���һ����������� +1ԭ����1��1000 ==  0�ǲ����ܳ���
        arr[arr.length-1]= new Random().nextInt(N-1)+1;
        //2.����±�
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
        System.out.println("======��������ռ����һ��+1�����ֶ�����+1����˭+2���ظ�==========");
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
        arr[j] = arr[i]; //jλ�õ���������iλ�õ���
        arr[i] = t;
    }
}
