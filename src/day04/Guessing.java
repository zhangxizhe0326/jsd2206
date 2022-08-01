package day04;

import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num =(int)(Math.random()*1000);//1-1000之内的随机数
        System.out.println(num);
        int guess;
        do {
            System.out.println("猜吧！");
            guess= scanner.nextInt();//1+3
            if (guess > num){
                System.out.println("猜大了");
            }else if (guess < num){
                System.out.println("猜小了");
            }else {
                System.out.println("猜中了");
            }
        }while (guess != num);//2









        /*
        System.out.println("猜吧！");
        int guess= scanner.nextInt();//1.
        while (guess != num){//2.
            if (guess > num){
                System.out.println("猜大了,继续猜吧！");
                guess = scanner.nextInt();//3.
            }else{
                System.out.println("猜小了,继续猜吧！");
                guess = scanner.nextInt();
            }
        }
        System.out.println("恭喜你猜对了");
        */
    }
}
