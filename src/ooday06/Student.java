package test;

public class Student extends Person{
    String stuId;
    Student(String name, int age, String address,String stuId) {
        super(name, age, address);
        this.stuId = stuId;
    }
    void sayHi(){
        System.out.println("我的名字是："+name+",我的年龄："+age+",地址："+address+",学号是："+stuId);
    }

}
