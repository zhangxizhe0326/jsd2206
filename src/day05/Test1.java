package day05;

public class Test1 {
    public static void main(String[] args) {
        for (int a = 1, b = 1; a <= 9; b++){
            System.out.print(b+"*"+a+"="+ a*b +"\t");
            if (a == b){
                System.out.println();
                b = 0;
                a++;
            }

        }














        /*int num=0;
        for (int i = 1;i<=100;i++){
            if (i %2 == 0){
                  num+=i;
            }
        }
        System.out.println(num);

        int num1=1;//阶乘
        for (int i = 1; i <=8 ; i++) {
            num1*=i;
        }
        System.out.println("num1="+num1);*/

        /*for (int i = 1,j = 1;i<=9;j++){
            System.out.print(j+"*"+i+"="+i*j+"\t");
            if (i == j){
                System.out.println();
                j = 0;
                i++;
            }
        }
        }*/








       /* for(int i=1;i<=6;i++){
            for(int j=1;j<=6-i;j++){ //空格
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }*/
    }

}