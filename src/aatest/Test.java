package aatest;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String path = "http://localhost:8088/myweb/reg?name=zhangsan&pwd=123456&nick=san&age=16";
        String[] arr = path.split("\\?");
        System.out.println("请求:"+arr[0]);
        System.out.println("参数:"+arr[1]);
        arr = arr[1].split("&");
        for (int i = 0; i < arr.length; i++) {
            String[] data = arr[i].split("=");
            System.out.println("参数名："+data[0]+",参数值："+data[1]);
        }
        /*
        String[] data = arr[0].split("=");
        String[] data1 = arr[1].split("=");
        String[] data2 = arr[2].split("=");
        String[] data3 = arr[3].split("=");
        System.out.println("参数名："+data[0]+"  参数值："+data[1]);
        System.out.println("参数名："+data1[0]+"  参数值："+data1[1]);
        System.out.println("参数名："+data2[0]+"  参数值："+data2[1]);
        System.out.println("参数名："+data3[0]+"  参数值："+data3[1]);
        System.out.println(Arrays.toString(arr));
        */
    }
}
