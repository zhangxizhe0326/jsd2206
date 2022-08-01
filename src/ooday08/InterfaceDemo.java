package ooday08;

import ooday04.Boo;

//接口的演示
public class InterfaceDemo implements Inter{
    public static void main(String[] args) {

    }

    @Override
    public void show() {
        System.out.println(NUM);
    }

    @Override
    public void test() {

    }
}


//演示接口的实现
interface Inter1{
    void show();
    void test();
}

class Aoo implements Inter1{
    @Override
    public void show() {

    }
    @Override
    public void test() {

    }
}


interface Inter2{
    void show();
}
interface Inter3{
    void test();
}
class Coo extends Boo implements Inter2,Inter3{

    @Override
    public void show() {

    }

    @Override
    public void test() {

    }
}

//接口的语法
interface Inter{
    public static final int NUM = 5;
    public abstract void show();
    //接口中的所有数据默认都是常量，接口中所有的方法默认都是抽象的
    int COUNT = 5;//默认public static final
    void test();//默认public abstract

//    int number;//编译错误，常量必须声明同时初始化
}

