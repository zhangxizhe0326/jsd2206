package ooday04;

public class Teacher extends Person {
    double salary;//工资

    Teacher(String name, int age, String address, double salary) {
        super(name, age, address);
        this.salary = salary;
    }

    void sayHi() {
        System.out.println("大家好，我叫" + name + ",今年" + age + "岁了，家住" + address + ",工资" + salary);
    }
}
