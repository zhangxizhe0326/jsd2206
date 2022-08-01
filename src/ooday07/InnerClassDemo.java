package ooday07;
//成员内部类演示
public class InnerClassDemo {
    public static void main(String[] args) {
        Mama m = new Mama();
        m.create();
    }

}

    class Mama{
        private String name;
        void create(){
            Baby b = new Baby();
        }
        class Baby{
            int c = 10;
            void showName(){
                System.out.println(name);//简写
                System.out.println(Mama.this.name);//完整写法
            }
        }
    }
