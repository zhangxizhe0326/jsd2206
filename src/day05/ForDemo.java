package day05;
//for结构的演示
public class ForDemo {
    public static void main(String[] args) {
        /*for (int times= 0; times<5;times++){
            System.out.println("行动是成功的阶梯");
        }*/

        /*for (int num = 1;num <= 9; num++){
            System.out.println(num+"*9="+num*9);
        }

        for (int num = 1;num <= 9; num+=2){
            System.out.println(num+"*9="+num*9);
        }*/

        for (int num = 1;num <= 9; num++){
            for (int num1 = 1 ; num1 <= num; num1++){
                System.out.print(num1+"*"+num+"="+num*num1 +"\t");
            }
            System.out.println();
        }
    }
}
