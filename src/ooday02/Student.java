package ooday02;
//学生类
public class Student {
    String name;
    int age;
    String address;
    void sayHi(){
        System.out.println("大家好，我叫："+name+",今年"+age+"岁了，家住"+address);
    }
    Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
