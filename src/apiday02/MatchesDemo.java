package apiday02;

/**
 * boolea 类型  matches(String regex):匹配
 * 使用给定的正则表达式(regex)验证当前字符串的格式是否符合要求，符合则返回true，否则返回false
 */
public class MatchesDemo {
    public static void main(String[] args) {
        /*
            邮箱的正则表达式:[a-zA-Z0-9_]+@[a-zA-z0-9]+(\.[a-zA-Z]+)+
         */
        String email = "wangkj@tedu.cn";
        String regex = "[a-zA-Z0-9_]+@[a-zA-z0-9]+(\\.[a-zA-Z]+)+";
        boolean matches = email.matches(regex);
        if (matches){
            System.out.println("是正确的邮箱格式");
        }else {
            System.out.println("不是正确的邮箱格式");
        }
    }
}
