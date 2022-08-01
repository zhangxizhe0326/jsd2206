package test;

public class Person {
    String name;
    int age;
    String address;
    Person(String name,int age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    void sayHi(){
        System.out.println("我的名字是："+name+",我的年龄："+age+",地址："+address);
    }
}
