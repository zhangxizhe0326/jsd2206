package test;

public class Doctor extends Person{
    String level;

    Doctor(String name, int age, String address,String level) {
        super(name, age, address);
        this.level = level;
    }
    void sayHi(){
        System.out.println("我的名字是："+name+",我的年龄："+age+",地址："+address+",职位:"+level);
    }
}
