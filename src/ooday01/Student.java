package ooday01;
//学生类
public class Student {
    //成员变量（对象的属性）
    String name;
    int age;
    String address;

    //方法 -----------（对象的行为/功能）
    void study(){
        System.out.println(name+"在学习");
    }
    void study(int age){
    }
    void sayHi(){
        System.out.println("大家好，我叫："+name+",今年"+age+"岁了，家住"+address);
    }



}
