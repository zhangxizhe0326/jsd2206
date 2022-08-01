package day06;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayDemo {
    public static void main(String[] args) {
        //数组的复制
        int[] a = {10,20,30,40,50};
        //a:原数组
        //b：目标数组
        //6：目标数组的长度
        //---若目标数组的长度大于原数组长度，则末尾补默认值
        //---若目标数组的长度小于原数组长度，则将原数组末尾的截掉
        int[] b = Arrays.copyOf(a,6);
        a = Arrays.copyOf(a,a.length+1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }












       /* int[] a = {10,20,30,40,50,60};
        int[] b = new int[6];//0,0,0,0,0,0

        // a:原数组  1：原数组的起始下标  b：目标数组
        // 0：目标数组的起始下标位置  4：要复制的元素个数
        System.arraycopy(a,0,b,0,6);

        for (int i = 0;i<b.length;i++){
            System.out.println(b[i]);
        }*/



    }
}
