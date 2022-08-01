package apiday02;

import java.util.Arrays;

/**
 * String[] split(String regex):拆分
 * 将当前字符串按照满足正则表达式的部分进行拆分，并将拆分出的以String[]形式来返回
 */
public class SplitDemo {
    public static void main(String[] args) {
        String line = "abc123def456ghi";
        String[] data = line.split("[0-9]+");//按数字拆分(数字就拆没了)
        System.out.println(Arrays.toString(data));//将data数组转换为字符串

        //最开始就是可拆分对象(.),那么数组第一个元素为空字符串
        //如果连续两个可拆分项，那么中间也会拆出一个空字符串
        //如果末尾连续多个可拆分项,那么拆出的空字符串被忽略
        line = ".123.456..78.....";
        String[] data1 = line.split("\\.");
        System.out.println(Arrays.toString(data1));
    }
}
