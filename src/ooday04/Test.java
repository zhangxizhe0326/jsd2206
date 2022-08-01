package ooday04;
//联系
public class Test {
    public static void main(String[] args) {
        Person[] p = new Person[9];
        //向上造型
        p[0] = new Student("aaa",25,"LF","111");
        p[1] = new Student("bbb",24,"JMS","222");
        p[2] = new Student("ccc",26,"SD","333");
        p[3] = new Teacher("ZLS",40,"SC",8000);
        p[4] = new Teacher("CLS",45,"XJ",10000);
        p[5] = new Teacher("LLS",33,"HN",7500);
        p[6] = new Doctor("ZDF",52,"BJ","主任医师");
        p[7] = new Doctor("LDF",42,"JMS","外科大夫");
        p[8] = new Doctor("WDF",62,"SD","内科大夫");
        for (int i = 0; i < p.length; i++) {
            Person p1 = p[i];
            System.out.println(p1.name);
            p1.sayHi();
        }
    }
}


