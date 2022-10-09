package class1;

import java.util.Arrays;

public class Test9_�ϲ�������������88 {
    public static void main(String[] args) {

    }

    // ����3  T=O(1) K=O(m+n)
    public static void merge3(int[] num1, int m, int[] num2, int n) {
        int k = m + n;
        for (int index = k - 1, num1Index = m - 1, num2Index = n - 1; index >= 0; index--) {
            if (num1Index < 0) {
                // n1 �Ѿ�ȡ�꣬��ȫȡnum2
                num1[index] = num2[num2Index--];
            } else if (num2Index < 0) {
                // n2 ֻ��3��Ԫ�� �Ѿ�ȡ��
                break;
            } else if (num1[num1Index] > num2[num2Index]) {
                // num1��Ԫ��ֵ����num2 ȥnum1 ˭��ȡ˭
                num1[index] = num1[num1Index--];
            } else {
                num1[index] = num2[num2Index--];
            }

        }
    }

    // ����2 T=O(m+n)  K=O(m+n)
    public static void merge2(int[] num1, int m, int[] num2, int n) {
        //1.��ʱ����
        int k = m + n;
        int[] t = new int[k];
        for (int index = 0, num1Index = 0, num2Index = 0; index < k; index++) {
            if (num1Index >= m) {
                // n1 �Ѿ�ȡ�꣬��ȫȡnum2
                t[index] = num2[num2Index++];
            } else if (num2Index >= n) {
                // n2 �Ѿ�ȡ�꣬��ȫȡnum1
                t[index] = num1[num1Index++];
            } else if (num1[num1Index] < num2[num2Index]) {
                // num1��Ԫ��ֵ<��num2 ȥnum1 ˭Сȡ˭
                t[index] = num1[num1Index];
            } else {
                t[index] = num2[num2Index];
            }
        }
        for (int i = 0; i <k ; i++) {
            num1[i]=t[i];
        }

    }

    // ����1

    public static void merge1(int[] num1, int m, int[] num2, int n){
        for (int i = 0; i < n; i++) {
            num1[m+i]=num2[i];
        }
        Arrays.sort(num1);
    }
}



