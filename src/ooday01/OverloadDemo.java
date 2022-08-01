package ooday01;
//重载的演示
public class OverloadDemo {
    public static void main(String[] args) {
        Aoo aoo=new Aoo();
        aoo.show();
        aoo.show("zhangsan");
        aoo.show(25);
        aoo.show("zhangsan",25);
        aoo.show(25,"zhangsan");

    }
}
