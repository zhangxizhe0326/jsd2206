package day04;

import javax.xml.crypto.Data;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*int a = 1;
        int num;
        int Guessing = (int)(Math.random()*100+1);//随机生成1-100随机数
        do {
            System.out.println("第"+a+"次，请猜出随机成生的数字");
            num = scanner.nextInt();

            if (num > Guessing){
                System.out.println("你猜的数太大了");
            }else if (num < Guessing){
                System.out.println("你猜的数太小了");
            }else{
                System.out.println("恭喜你用了"+a+"次，就猜对了");
            }
            a++;

        }while(num != Guessing);*/



        /*int a = 1;
        System.out.println("第"+a+"次，请猜出随机成生的数字");
        int num = scanner.nextInt();
        int Guessing = (int)(Math.random()*100+1);//随机生成1-100随机数
        while(num !=  Guessing){
            a++;
            if (num > Guessing) {
                System.out.println("你猜的数太大了");
            }else {
                System.out.println("你猜的数太小了");
            }
            System.out.println("第"+a+"次，请猜出随机成生的数字");
            num = scanner.nextInt();
        }
        System.out.println("恭喜你用了"+a+"次，就猜对了");*/





        /*System.out.println("请选择你需要的服务:1.存款业务 2.取款业务 3.查询业务 4.退卡");
        int CommandBySwitch = scanner.nextInt();
        switch (CommandBySwitch){
            case 1:
                System.out.println("存款业务");
                break;
            case 2:
                System.out.println("取款业务");
                break;
            case 3:
                System.out.println("查询业务");
                break;
            case 4:
                System.out.println("退卡");
                break;
            default:
                System.out.println("输入错误");
                break;
        }*/






      /*  System.out.println("请输入你的成绩：");
        double ScoreLevel =scanner.nextDouble();
        if (ScoreLevel > 100 || ScoreLevel <0){
            System.out.println("成绩不合法");
        }else if (ScoreLevel >= 90){
            System.out.println("A-优秀");
        }else if (ScoreLevel >=80){
            System.out.println("B-中等");
        }else if (ScoreLevel >=60){
            System.out.println("C-一般");
        }else {
            System.out.println("D-不及格");
        }
*/





        /*int a = 1;
        int b = 0;
        do {
            b += a;
            a++;
        }while (a <= 100);
        System.out.println(b);*/
        /*while (a <= 100){
            b += a;
            a++;
        }
        System.out.println(b);*/




        /*System.out.println("请输入年份");
        int year = scanner.nextInt();
        System.out.println("请输入月份");
        int month = scanner.nextInt();
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println(month+"月，有31天");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println(month+"月，有30天");
                break;
            case 2:
                if (year % 4 ==0 && year % 100 !=0 || year %400 == 0){
                    System.out.println(month+"月，有29天");
                }else {
                    System.out.println(month+"月，有28天");
                }


        }*/


       /* if (year % 4 ==0 && year % 100 !=0 || year %400 == 0){
            switch (month){
                case 1:
                    System.out.println("31天");
                    break;
                case 2:
                    System.out.println("29天");
                    break;
                case 3:
                    System.out.println("31天");
                    break;
                case 4:
                    System.out.println("30天");
                    break;
                case 5:
                    System.out.println("31天");
                    break;
                case 6:
                    System.out.println("30天");
                    break;
                case 7:
                    System.out.println("31天");
                    break;
                case 8:
                    System.out.println("31天");
                    break;
                case 9:
                    System.out.println("30天");
                    break;
                case 10:
                    System.out.println("31天");
                    break;
                case 11:
                    System.out.println("30天");
                    break;
                case 12:
                    System.out.println("31天");
                    break;
            }
        }else {
            switch (month) {
                case 1:
                    System.out.println("31天");
                    break;
                case 2:
                    System.out.println("28天");
                    break;
                case 3:
                    System.out.println("31天");
                    break;
                case 4:
                    System.out.println("30天");
                    break;
                case 5:
                    System.out.println("31天");
                    break;
                case 6:
                    System.out.println("30天");
                    break;
                case 7:
                    System.out.println("31天");
                    break;
                case 8:
                    System.out.println("31天");
                    break;
                case 9:
                    System.out.println("30天");
                    break;
                case 10:
                    System.out.println("31天");
                    break;
                case 11:
                    System.out.println("30天");
                    break;
                case 12:
                    System.out.println("31天");
                    break;
            }
        }*/


        /*System.out.println("请输入一个整数：");
        int num = scanner.nextInt();
        if (num > 0){
            System.out.println("+");
        }else if (num < 0){
            System.out.println("-");
        }else {
            System.out.println("0");
        }*/



    }
}
