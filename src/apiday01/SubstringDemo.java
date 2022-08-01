package apiday01;
//String substring(int statr,int end);
//截取当前字符串中指定范围内的字符串(含头不含尾)
public class SubstringDemo {
    public static void main(String[] args) {
        String str = "www.tedu.cn";
        String name = str.substring(4,8);
        System.out.println(name);

        name = str.substring(4);
        System.out.println(name);
        int a = str.indexOf(".");
        int b = str.lastIndexOf(".");
        String username = str.substring(a+1,b);
        System.out.println(username);
    }
}
