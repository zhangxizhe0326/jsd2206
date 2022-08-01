package aatest;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("李言豪");
        builder.append(":ε=(´ο｀*)))唉我就是玩！");
        String s = builder.toString();
        System.out.println(s);
        builder.replace(4,15,"略略略");
        System.out.println(builder);
        builder.delete(0,4);
        System.out.println(builder);
        builder.insert(8,"我是李言豪");
        System.out.println(builder);
    }
}
