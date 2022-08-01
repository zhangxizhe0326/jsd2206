package day06;

import java.util.Arrays;

//方法的演示
public class MethodDemo {
    public static void main(String[] args) {
        /*say();//调用say()方法
        System.out.println("继续执行...");
        sayHi("张希哲");*/
//        sayHello("ZXZ",21);
//        double a =getNum();
//        System.out.println(a);

//        int b = plus(5,6);
//        System.out.println(b);
        int[] arr1 = testArray();
        Arrays.sort(arr1);
        System.out.println(arr1.length);


        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+"\t");
        }
    }
    //无参有返回值，并且返回值是个数组
    public static int[] testArray(){
         int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
    }

    //无参无返回值的方法
    public static void say(){
        System.out.println("大家好，我叫ZXZ，今年21岁了");
    }
    //有参无返回值
    public static void sayHi(String name){
        System.out.println("大家好，我叫"+name+"，今年21岁了");
    }

    public static void sayHello(String name , int age){
        System.out.println("大家好，我叫"+name+"，今年"+age+"岁了");
    }

    //无参有返回值
    public static double getNum(){
        /*
        java规定：
            有返回值的方法中，必须得通过return来返回数据
            并且return后数据的类型，必须和返回值类型匹配
        */
        return 8.88;//结束方法的执行，返回结果给调用方
    }

    //有参有返回值
    public static int plus(int num1,int num2){
        int num = num1+num2;
        return num;//返回的是num里面的那个数
    }



}
