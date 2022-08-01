package day05;
//九九乘法表
public class MultiTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++){
            for (int a = 1;a <= i; a++){
                System.out.print(a+"*"+i+"="+i*a +"\t");
            }
            System.out.println();
        }
    }
}
