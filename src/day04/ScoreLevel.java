package day04;
import java.util.Scanner;
//成绩等级判断
public class ScoreLevel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩：");
        double price = scanner.nextDouble();
        // A:成绩大于90
        // B:成绩大于等于80并且小于90
        // C:成绩大于等于60并且小于80
        // D:成绩小于60
        if (price>0 && price<100){
            if (price > 90){
                System.out.println("A-优秀");
            }else if (price >= 80){
                System.out.println("B-良好");
            }else if (price >= 60){
                System.out.println("C-中等");
            }else{
                System.out.println("D-不及格");
            }
        }else {
            System.out.println("成绩不合法");
        }

    }
}
