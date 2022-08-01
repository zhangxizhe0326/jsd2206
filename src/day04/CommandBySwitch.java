package day04;
import java.util.Scanner;
public class CommandBySwitch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请选择功能:1.存款 2.取款 3.查询余额 4.退卡");
        int command = scanner.nextInt();
        switch (command){
            case 1:
                System.out.println("存款业务...");
                break;
            case 2:
                System.out.println("取款业务....");
                break;
            case 3:
                System.out.println("余额查询操作....");
                break;
            case 4:
                System.out.println("退卡操作....");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
}
