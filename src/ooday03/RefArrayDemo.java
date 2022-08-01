package ooday03;

public class RefArrayDemo {
    public static void main(String[] args) {
        Student[] stus = new Student[3];//创建Student数组对象
        //若元素不赋值，则默认值为null，容易发生空指针异常
        stus[0] = new Student("zhangsan",25,"LF");
        stus[1] = new Student("lisi",24,"JMS");
        stus[2] = new Student("wangwu",26,"SD");
        System.out.println(stus[0].name);//输出第一个学生的名字
        stus[1].age = 27;//修改第二个学生的年龄为27
        stus[2].sayHi();//第三个同学跟大家问好
        for (int i = 0;i<stus.length;i++){//遍历所有学生
            System.out.println(stus[i].name);//输出每个学生的名字
            stus[i].sayHi();//每个学生跟大家问好
        }
    }
}
