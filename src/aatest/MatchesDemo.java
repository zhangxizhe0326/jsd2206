package aatest;
//正则演示
public class MatchesDemo {
    public static void main(String[] args) {
        String str = "1416289525@qq.com";
        String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
        boolean match = str.matches(regex);
        if(match){
            System.out.println("是邮箱");
        }else {
            System.out.println("不是邮箱");
        }
    }
}
