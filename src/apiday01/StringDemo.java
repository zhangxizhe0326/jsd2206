package apiday01;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

//String的演示
public class StringDemo {
    public static void main(String[] args) {
        /*
            常见面试题：
                String s = new String("hello");
                问：如上语句创建了几个对象
                答：两个
                    第一个：字面量对象"hello"
                            java会创建一个String对象来表示字面量"hello"，并将其存入常量池
                    第二个：new String()
                            new String()时会在创建一个字符串对象，并引用hello的内容
        */

        String s = new String("hello");//创建两个对象
        String s1 = "hello";//复用常量池中的字面量对象
        System.out.println("s:"+s);
        System.out.println("s1:"+s1);
        System.out.println(s == s1);//false  s与s1的地址不同
        //在实际应用中，String比较相等一般都是比较字符串内容是否相等
        //因此我们需要使用equals()方法来比较字符串的内容是否相同
        System.out.println(s.equals(s1));//true .equals()比较的是内容是否相等


        /*
        String s1 = "123abc";//堆中有一个123abc字面量对象，同时缓存到常量池中
        //编译器在编译时，若发现时两个字面量相连，则会直接连接好，并将结果保存起来
        //如下语句相当于 String s2 = "123abc";
        String s2 = "123"+"abc";//直接复用常量池中的
        System.out.println(s1 == s2);//true
        String s3 = "123";
        //因为s3是个变量，所以在编译期，并不会直接连接好
        String s4 = s3 + "abc";//常见一个新的对象存储123abc
        System.out.println(s4 == s1);//false
        */
    }
}
