package apiday03;

public class BinaryDemo {
    public static void main(String[] args) {
        /*
            1)编译器在编译是会将10进制编译为2进制,然后按照2进制来运算
                .java(45)----编译后-----.class(101101)
            2)int类型是32位的2进制数,显示2进制自动省略高位0
            3)Integer.toBingaryString()可以将底层的2进制数返回
                System.out.println()将2进制转换为10进制输出
                01111100 00000111 11110101 10101010
         */
        int n = 45;//编译时会被编译为：101101
        System.out.println(Integer.toBinaryString(n));//以2进制输出
        System.out.println(n);//以10进制输出
        n++;//将101101增1 --- 101110
        System.out.println(Integer.toBinaryString(n));//4以2进制输出
        System.out.println(n);//以10进制输出

    }
}
