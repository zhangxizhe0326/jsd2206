package aatest;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import sun.nio.cs.ArrayEncoder;

import java.util.Arrays;

public class ReplaceAllDemo {
    public static void main(String[] args) {
        String str = "姓名：张希哲，年龄：21。";
        String test = str.replaceAll("[0-9]+","#NUMBER#");
        System.out.println(test);
    }
}
