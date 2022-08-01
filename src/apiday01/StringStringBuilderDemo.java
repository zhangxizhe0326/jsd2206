package apiday01;
//String 与 StringBuilder的演示
public class StringStringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("a");
        for (int i = 0; i <10000000; i++){
            s.append(i);
        }
        System.out.println("执行完毕");
        /*
//        String 不适合频繁的修改内容(效率比较低)---适合看
        String s = "a";
        for (int i = 0; i <10000000;i++){
//            s = s+i;//每次修改都会在内存中分配新的对象---所以很慢
            s = "abc";//每次都是复用字面量对象-----------所以很快
        }
        System.out.println("执行完毕");
*/
    }
}
