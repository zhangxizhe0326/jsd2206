package apiday01;
//StringBuilder演示
public class StringBuilderDemo {
    public static void main(String[] args) {
        /*
        //StringBuilder的创建方式：
        StringBuilder builder1 = new StringBuilder();//创建了一个空字符串
        StringBuilder builder2 = new StringBuilder("abc");//创建了一个abc的串
        String str = "abc";
        StringBuilder builder3 = new StringBuilder(str);//基于str创建了一个字符串
        String str2 = builder3.toString();//将builder3转化为String类型
        */
        String str = "好好学习Java";
        StringBuilder builder = new StringBuilder(str);
        //append():追加内容---在末未追加
        builder.append(",为了找个好工作");
        System.out.println(builder);//好好学习Java,为了找个好工作
        //replace():替换部分内容(含头不含尾)
        builder.replace(9,16,"就是为了改变世界");
        System.out.println(builder);//好好学习Java,就是为了改变世界
        //delete():删除部分内容(含头不含尾)
        builder.delete(0,8);//删除下标0-7的字符
        System.out.println(builder);//,就是为了改变世界
        //insert():插入内容
        builder.insert(0,"活着");
        System.out.println(builder);//活着,就是为了改变世界
    }
}
