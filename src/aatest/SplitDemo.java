package aatest;

import java.util.Arrays;

public class SplitDemo {
    public static void main(String[] args) {
        String str = "www.baidu.com";
        String[] test = str.split("\\.");
        System.out.println(Arrays.toString(test));
    }
}
