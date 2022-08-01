package apiday01;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

// String trim();
// 去处当前字符串两边的空白字符
public class TrimDemo {
    public static void main(String[] args) {
        String str = "       hello world       ";
        System.out.println(str);//        hello world
        System.out.println(str.length());
        str = str.trim();
        System.out.println(str);
        System.out.println(str.length());
    }
}
