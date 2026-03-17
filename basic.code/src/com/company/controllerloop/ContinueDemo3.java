package com.company.controllerloop;
import java.util.Scanner;
public class ContinueDemo3 {
    public static void main(String[] args){
        //列出1-n之间所有不包含数字4，又不是4的倍数的整数，按升序输出，满足n>=1&&n<=100000
        Scanner sc=new Scanner(System.in);
        int n=0;
        while(true){
            System.out.println("请输入一个正整数n：");
            n=sc.nextInt();
            if(n<1||n>100000){
                System.out.println("输入不合法，请重新输入");
            }else break;
        }

        for(int i=1;i<=n;i++){
            //用布尔表示是否含有4，while循环遍历每一位数
            /*
            boolean has4=false;
            int x=i;
            while(x>0){
                if(x%10==4){
                    has4=true;
                    break;
                }
                x/=10;
            }
            if(i%4==0||has4){
                continue;
            }
            System.out.println(i);*/
           //用字符串
            if(i%4==0){
                continue;
            }else if(String.valueOf(i).contains("4")){
                continue;
            }
            System.out.println(i);
            sc.close();            //关闭这个Scanner对象，释放它占用的资源（这里可以不用，但是养成好习惯）

        }

    }
}
