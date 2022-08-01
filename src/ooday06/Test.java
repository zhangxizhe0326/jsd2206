package test;

public class Test {
    public static void main(String[] args) {
        Person[] p = new Person[3];
        p[0] = new Student("张三",22,"HN","20203001162");
        p[1] = new Teacher("王晶",35,"HN",8000);
        p[2] = new Doctor("王五",35,"HN","主治医师");
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].name);
            p[i].sayHi();
        }
    }
}
