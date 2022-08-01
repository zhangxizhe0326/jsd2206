package ooday07;
//匿名内部类演示
public class NstInnerClassDemo {
    public static void main(String[] args) {
        //对于那个匿名内部类而言
        //Aoo是它的超类
        //NstInnerClassDemo是它的外部类

        //1 系统自动创建了Aoo的派生类，但没有名字
        //2 为该派生类创建了一个对象，名为01
        //  ---new Aoo(){}是在创建Aoo的派生类的对象
        //3 大括号内是派生类的方法体

        // new Aoo()
        //
//        Aoo o1 = new Aoo();//抽象类不能被实例化
        int num = 5;
        num = 55;
        A1 a = new A1();
        System.out.println(a.c-num);
        Aoo o1 = new Aoo(){
            @Override
            void move() {

            }
        };
        o1.move();

        Boo o3 = new Boo() {
            @Override
            void show() {
                System.out.println("show");
//                num = 15;--编译错误，匿名内部类中不能修改外面局部变量的值
//                            因为在此处该变量会默认为final
            }
        };
        o3.show();
    }
}
class A1{
    int c = 10;
}
abstract class Boo extends Aoo{
    abstract void show();
    void move(){
    }
}
abstract class Aoo{
    abstract void move();
}
