package day04;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         int num = scanner.nextInt();
        switch (num){
            case 1:
                System.out.println(111);
                break;
            case 2:
                System.out.println(222);
                break;
            case 3:
                System.out.println(333);
                break;
            default:
                System.out.println(666);
                break;
        }
    }
}
