package day05;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*//Addition随机加法运算器
        Scanner scanner=new Scanner(System.in);
        int score = 0;//分数
        for (int a = 1;a <=10;a++){
            int num =(int)(Math.random()*100);
            int num1 =(int)(Math.random()*100);
            int num3 = num+num1;//答案
            System.out.println("("+a+")"+num+"+"+num1+"=?");//出题

            System.out.print("请给出你的答案：");
            int nums = scanner.nextInt();//作答

            if (num3 == nums){//判断答案
                System.out.println("恭喜你答对了！");
                score+=10;
            }else{
                System.out.println("很遗憾你答错了，继续努力！");
            }
        }
        System.out.println("你的成绩是:"+score);
        if (score >= 90){
            System.out.println("A-优秀");
        }else if (score >= 80){
            System.out.println("B-良好");
        }else if (score >= 60){
            System.out.println("C-一般");
        }else {
            System.out.println("D-不及格");
        }*/

        /*//MultiTable九九乘法表
        //要求：输出九九乘法表
        for (int a = 1; a<=9;a++){
            for (int b = 1; b<=a;b++){
                System.out.print(b+"*"+a+"="+a*b +"\t");
            }
            System.out.println();
        }*/

        /*//数组小代码练习：声明、初始化、访问、遍历
        int[] a = new int[3];
        a[0]=1;
        a[1]=2;
        a[2]=0;
        System.out.println(a[0]);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }*/



    }
}
