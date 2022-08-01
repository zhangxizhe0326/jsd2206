package apiday01;

public class IntegerDemo {
    public static void main(String[] args) {
        /*
        Integer i1 = new Integer(5);
        Integer i2 = new Integer(5);
        System.out.println(i1==i2);//false,因为==比较的是地址

        //Integer.valueOf()会复用-128到127范围内的数据---使用valueOf()方式更多一些
        Integer i3 = Integer.valueOf(5);
        Integer i4 = Integer.valueOf(5);
        System.out.println(i3 == i4);//false
        */

        /*//触发自动装箱的特性,会被编译为:Integer i = Integer.valueOf(5);
        Integer i = 5;//基本类型到包装类型----装箱
        //触发自动拆箱特性,会被编译为:int j = i.intValue();
        int j = i;//包装类型到基本类型----拆箱
        System.out.println(j);*/
        //演示包装备的常用操作
        //1）可以通过包装类来获取基本类型的取值范围:
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        int min = Integer.MIN_VALUE;
        System.out.println(min);

        long max1 = Long.MAX_VALUE;
        long min1 = Long.MIN_VALUE;
        System.out.println(max1);
        System.out.println(min1);

        //2)包装类型可以将字符串转换为对应的基本类型----必须熟练掌握
        /*
            网页中输入：用户名，年龄（38），商品价格（56.789）
            从网页中获取到的数据----其实都是字符串类型
         */
        String s1 = "38";
        int age = Integer.parseInt(s1);//将字符串s1转换为int类型
        System.out.println(age);
        String s2 = "123.456";
        double price = Double.parseDouble(s2);
        System.out.println(price);
    }
}
