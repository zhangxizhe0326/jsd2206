package day06;

import java.util.ArrayList;
import java.util.Arrays;
//求数组元素最大值，并将最大值放在数组最后一个元素的下一个位置
public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = (int)(Math.random()*100);
            System.out.print(arr[i]+"\t");
        }
        Arrays.sort(arr);//对arr进行升序排列
        System.out.println("排序后数据：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println("倒着输出");
        for (int i = arr.length-1 ; i>=0;i--){
            System.out.print(arr[i]+"\t");
        }










        /*int[] arr = new int[10];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = (int)(Math.random()*100);
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        //找最大值：
        int max = arr[0];//假设第一个元素为最大值
        for (int i = 1; i < arr.length; i++) {//遍历剩余元素
            if (arr[i]>max){
                max = arr[i];//修改max为较大值
            }
        }
        System.out.println("最大值:"+max);

        arr = Arrays.copyOf(arr,arr.length+1);//扩容
        arr[arr.length-1] = max;//将max赋值给arr的最后一个元素
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

    }
}
