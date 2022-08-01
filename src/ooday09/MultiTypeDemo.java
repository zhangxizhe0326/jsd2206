package ooday09;
//多态的演示
public class MultiTypeDemo {
    public static void main(String[] args) {
        //- 引用所指向的对象，就是该类型
        //- 引用所指向的对象，实现了该接口或继承了该类
        Aoo o = new Boo();//向上造型
        Boo o1 = (Boo)o;//强制类型转换  引用o所指向的对象，就是Boo类型---符合第一条
        Inter o2 = (Inter) o;//引用o所指向的对象，Boo()实现了Inter接口---符合第二条
//        Coo o3 = (Coo) o;//运行时会发生ClassCastException类型转换异常
        if (o instanceof Coo){
            Coo o4 = (Coo) o;
        }else {
            System.out.println("o不是Coo类型");
        }

    }
}
