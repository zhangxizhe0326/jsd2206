package apiday03;
//位运算的演示
public class OperDemo {
    public static void main(String[] args) {
        int n = 0x17757af6;
        int m = 0xff;
        int k = n&m ;
        System.out.println(k);
        int n1 = 0xde;
        int m1 = 0x9d00;
        int k1 = n1|m1;
        System.out.println(k1);

    }
}
