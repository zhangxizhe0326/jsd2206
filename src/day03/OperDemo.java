package day03;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class OperDemo {
    public static void main(String[] args) {
        /*
        1.算数运算符：+,-,*,/,%,++,--
            %:取模/取余,余数为0即为整除
            ++/--:自增1/自减1,可在变量前也可在变量后
                单独使用时,在前在后都一样
                被使用时,在前在后不一样
        */
            /*System.out.println(5%2);//1,商2余1
        System.out.println(8%2);//0,商4余0---整除
        System.out.println(2%8);//2,商0余2*/

        /*int a = 5,b = 5;
         *//*a++;//相当于a=a+1
        ++b;//相当于b=b+1*//*
        int c = a++;//将a++的值5赋值给c  a自增1变为6
                    //a++的值为a(5),所以c的值就是5
        int d = ++b;//将++b的值6赋值给d  b自增1变为6
                    //++b的值为b+1(6),所以d的值就是6
        System.out.println(a);//6
        System.out.println(b);//6
        System.out.println(c);//5
        System.out.println(d);//6*/

        /*int a = 5,b = 5;
        a--;
        --b;
        System.out.println(a);//4
        System.out.println(b);//4*/

        /*int a = 5,b = 5;
        int c = a--;//将a--的值5赋值给c  a自减1变为4
        int d = --b;//将--b的值4赋值给d  b自减1变为4
        System.out.println(a);//4
        System.out.println(b);//4
        System.out.println(c);//5
        System.out.println(d);//4*/

        /*
        2、关系运算符：> 、< 、>= 、<= 、== 、！=
               关系运算的结果为boolear型,
               关系成立为true，关系不成立则为false
        */
        /*int a = 5,b = 10,c = 5;
        boolean b1 = a>b;
        System.out.println(b1);//false
        System.out.println(c<b);//true
        System.out.println(a>=c);//true
        System.out.println(a<=b);//true
        System.out.println(a==c);//true
        System.out.println(a!=c);//false
        System.out.println(a+c>10);//false
        System.out.println(a%2==0);//false
        System.out.println(a++>5);//false------a自增1变为6
        System.out.println(a++>5);//true-------a自增1变为7*/

        /*
        3、逻辑运算符： &&  ||  ！
            &&：短路与(并且)，两边都为真则为真，见false则false
                若第1个条件为false，则发生短路(后面的不执行了)
            ||：短路或(或者)，有真则为真，见true则true
                若第1个条件为true，则发生短路(后面的不执行了)
            !：逻辑非(取反)，非真则假，非假则真
            逻辑运算时建立在关系运算的基础之上的
            逻辑运算的结果也是boolear型
        */

        /*int a=5,b=10,c=5;
        boolean b1 = b>=a && b<c;
        System.out.println(b1);//true&&false=false
        System.out.println(b<=c && b>a);//false&&true=false
        System.out.println(a==b && c>b);//false&&false=false
        System.out.println(b!=c && a<b);//true&&true=true*/

        /*int a=5,b=10,c=5;
        System.out.println(b>=a || b<c);//true||false=true
        System.out.println(b<=c || b>a);//false||true=true
        System.out.println(b!=c ||a <b);//true||true=true
        System.out.println(a==b || c>b);//false||false=false*/

        /*int a=5,b=10,c=5;
        boolean b2 = !(a<b);
        System.out.println(b2);//!true=false
        System.out.println(!(a>b));//!false=true*/

        /*
        4.赋值运算符：
            简单赋值运算符：=
            扩展赋值运算符：+=、-=、*=、/=、%=
            ---注意：扩展赋值运算符自带强转功能
        */

        /*int a = 5;
        a +=10;//a = a + 10 相当于 a = （int）（a+10）
        System.out.println(a);//15
        a *= 2;//a = a=2;
        System.out.println(a);//30
        a /= 6;//a = a/6
        System.out.println(a);//5
        a -= 2;//a = a-2
        System.out.println(a);//3
        a %=2;//a = a%2
        System.out.println(a);//1


        小面试题：
        short s = 5;
        s = s+10;//编译错误，运算时系统统一转换为int类型需要强制转换
                                s = (short)(s+10);
        s += 10;//相当于：s = （short）（s+10）

        /*
        字符串连接运算符
         + ：
            若两边为数字，则做加法运算
            若两边出现字符串，则做字符串连接
         */

        /*int age = 38;
        System.out.println("age=");//age=
        System.out.println(age);//38
        System.out.println("age="+age);//age=38
        System.out.println("我的年龄是"+age);//我的年龄是38
        System.out.println("我今年"+age+"岁了");//我今年38岁了

        String name = "WKJ";
        System.out.println("name"+name);//name=WKJ
        System.out.println("大家好，我叫"+name);//大家好，我叫WKJ
        System.out.println("大家好，我叫"+name+",今年"+age+"岁了");//大家好，我叫WKJ，今年38岁了*/

        /*
             整个表达式是有值得，它的值要么式问号后的数1，要么是冒号后的数2
             判断boolean的值：
               若为true，则整个表达式的结果为？后的数1
               若为false，则整个表达式的结果为：后的数2
       */

       /* int num  = 0;
        int flag = num > 0 ?1:-1;
        System.out.println(flag);//-1
        int a = 8,b = 55;
        int max = a > b ? a : b;
        System.out.println("max="+max);*/

    }
}
