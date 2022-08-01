package apiday03;
//补码的演示
public class ComplementDemo {
    public static void main(String[] args) {
        /*//规律数:
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println(min);
        System.out.println(max);
        System.out.println(Integer.toBinaryString(max));
        System.out.println(Integer.toBinaryString(min));
        System.out.println(Integer.toBinaryString(-1));*/
        /* int n = -45;
        System.out.println(Integer.toBinaryString(n));
        int m = -11;
        System.out.println(Integer.toBinaryString(m));*/
        /*//互补对称现象：-n=~n+1
        int n = -7;
        int m = ~n+1;
        System.out.println(m);
        int i = 12;
        int j = ~i+1;
        System.out.println(j);*/
        int n = 0xf6;
        System.out.println(Integer.toBinaryString(n));
    }
}
