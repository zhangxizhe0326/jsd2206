package apiday01;
// char charAt(int index);
// 返回当前字符串指定位置上的字符---根据位置查找符号

public class CharAtDemo {
    public static void main(String[] args) {
        String str = "thinking in java";
        char c = str.charAt(9);//获取str中下标9所对应的字符
        System.out.println(c);//i
        char cc = str.charAt(13);
        System.out.println(cc);//a
    }
}
