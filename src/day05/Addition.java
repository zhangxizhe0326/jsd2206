package day05;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int score = 0;//总分
        for (int i = 1; i <= 10; i++) {//10次
            // 1 出题 2 答题 3 判题
            int num = (int) (Math.random() * 100);//加数0-99的随机数
            int num1 = (int) (Math.random() * 100);//加数0-99的随机数
            int result = num + num1;
            System.out.println("(" + i + ")" + num + "+" + num1 + "=?");//1、出题

            System.out.print("请算出答案：");
            int num2=scanner.nextInt();//答题
            if (num2 == -1){
                System.out.println("退出答题");
                break;
            }
            if (num2 == result){//判题
                System.out.println("恭喜你，答对了加10分");
                score+=10;
            }else{
                System.out.println("很遗憾，答错了");
            }

        }
        System.out.println("===================");
        System.out.println("总分为："+score);
        switch (score){
            case 100: case 90:
                System.out.println("A-优秀");
                break;
            case 80: case 70:
                System.out.println("B-良好");
                break;
            case 60:
                System.out.println("C-一般");
                break;
            default:
                System.out.println("D-不及格，继续努力！");
                break;
        }


        /*if (score >= 90){
            System.out.println("A-优秀");
        }else if (score >=80){
            System.out.println("B-良好");
        }else if (score >=60){
            System.out.println("C-一般");
        }else {
            System.out.println("不及格，继续努力！");
        }*/

    }
}
