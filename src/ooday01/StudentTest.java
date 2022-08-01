package ooday01;
//学生类的测试类
public class StudentTest {
    public static void main(String[] args) {
        //创建一个学生对象
        Student zs = new Student();
        //给成员变量赋值
        zs.name="张三";
        zs.age=18;
        zs.address="河北廊坊";
        //调用方法
        zs.study();
        zs.sayHi();


        Student ls=new Student();
        ls.name="李四";
        ls.age=25;
        ls.address="黑龙江佳木斯";
        ls.study();
        ls.sayHi();


    }
}
