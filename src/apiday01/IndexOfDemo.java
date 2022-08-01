package apiday01;
public class IndexOfDemo {
    public static void main(String[] args) {
        String str  = "thinking in java";
        int indexOf = str.indexOf("in");//检索in 在str中第一次出现的位置
        int indexOf1 = str.indexOf("in",3);//从下标为3的位置找in在str中第一次出现的位置
        System.out.println(indexOf);
        int lasstIndexOf = str.lastIndexOf("a");//检索a 在str中最后一次出现的位置
        indexOf = str.indexOf("abc");//若字符串在str中不存在，则返回-1 0
        System.out.println(indexOf);
        System.out.println(indexOf1);
        System.out.println(lasstIndexOf);
    }
}
