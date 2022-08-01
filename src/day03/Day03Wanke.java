package day03;

public class Day03Wanke {
    public static void main(String[] args) {
        /*
        1.年龄age在18到50之间（不包括18和50）
          ---age>18 && age<50
        2.年龄age在18到50之间（包括18和50）
          ---age>=18 && age<50
        3.成绩score合法：在0到100之间（包括0和100）
          ---score>=0 && score <=100
        4.成绩score不合法：不在0到100之间
          ---score<0 || score > 100
        */

        /*double score = 560;
        if (score < 0 || score >100){
            System.out.println("成绩不合法");
        }else {
            System.out.println("成绩合法");
        }*/

       /* int a = 8,b = 5;
        int max;
        if (a>b){
            //....
            //....
            max = a;
        }else {
            //....
            //....
            max = b;
        }
        System.out.println("max="+max);*/

        /*
        闰年的判断
        能被4整除，并且 不能被100整除 或者 能被400整除
         */
        int year = 2000;//年份
        if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0 ) {
            System.out.println(year+"闰年");
        }else {
            System.out.println(year+"平年");
        }
        System.out.println(2000%100);

    }
}
