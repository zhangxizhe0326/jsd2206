package day02;

import java.util.Scanner;
public class VarDemo {
    public static void main(String[] args) {
        //1 变量的声明：---开账户
        int a; //声明一个整型的变量，名为a
        int b,c,d; //声明三个整型的变量，名为b,c,d
        //int a; //编译错误，变量不能重名

        //2 变量的初始化： ---给帐户存钱
        int e = 250; //声明整型变量e并赋值为250
        int f; //声明整形变量f
        f = 250;//给变量f复制为250
        f = 360;//修改变量f的值为360

        //3 变量的使用：----使用的是账户里的钱
        int g = 5;
        int h = g+10;//取出g的值5，再加10以后，在复制给变量h
        System.out.println(h);//输出变量h的值15
        System.out.println("h");//输出h，双引号中的内容原样输出

        g = g+10;//在g的本身基础之上增10
        System.out.println(g);//输出15

//        System.out.println(i);//编译错误，变量i未声明
        int i;
//        System.out.println(i);//编译错误，变量i为初始化
        i = 1;
        System.out.println(i);//输出i的值1

        //4 变量的命名
        int a1,a_5$,_3c,$_5;
        // int 1a; // 编译错误，不能以数字开头
//        int a*b //编译错误，不能包含*等特殊符号
        int aa =5;
//        System.out.println(aA);//编译错误，严格区分大小写
//        int class;//编译错误，不能使用关键字
        //不能使用关键字和保留字

        //int 年龄; //允许中文，但不建议
        //int nianLing; //必须杜绝，既不直观也不专业，不建议
        int age; // 建议  英文的见名知义
        int score,myScore,myJavaScore; // 建议 “小驼峰命名法”
    }
}

