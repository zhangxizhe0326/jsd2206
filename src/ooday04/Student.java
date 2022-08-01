package ooday04;

public class Student extends Person{
    String stuId;//学号
    Student(String name,int age,String address,String stuId){
        super(name,age,address);//传的是name/age/address的值
        this.stuId = stuId;
    }
    void sayHi() {
        System.out.println("大家好，我叫" + name + ",今年" + age + "岁了，家住" + address + ",学号" + stuId);
    }
}
