package day03;

public class Test {
    public static void main(String[] args) {
        System.out.println(8%2);//0
        System.out.println(7%3);//1
        System.out.println(3%8);//3
        int a = 1,b = 2;
        a++;
        System.out.println(a);//2
        b--;
        System.out.println(b);//1

        int c = 4,d = 3;
        int e = c++;
        int f = --d;
        System.out.println(c);//5
        System.out.println(d);//2
        System.out.println(e);//4
        System.out.println(f);//2

        int a1 = 10,b1=15;
        System.out.println(a1>b1);//false
        System.out.println(b1>=a1);//true
        System.out.println(b1 == a1);//false
        System.out.println(a1 != b1);//true

        System.out.println((a1 += 9) >= b1);//true
        System.out.println(a1 > b1);//true
    }
}
