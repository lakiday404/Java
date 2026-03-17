package com.company.ifdemo;
import java.util.Scanner;
public class ifDemo4 {
    public static void main(String[] args){
        //如果一个整数是偶数并且大于50.为牛客树，给定一个整数n，判断其是否为牛妹树。1<=n<=100
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数n:");
        int  n=sc.nextInt();
        /*
       if(n>=1&&n<=100){
           if(n%2==0){
               if(n>50){
                   System.out.println(n+"是一个偶数并且大于50，因此是牛妹数，输出yes");
               }else{
                   System.out.println(n+"是一个偶数，但是不大于50，因此不是牛妹数，输出no");
               }
           }else{
               System.out.println(n+"不是一个偶数");
           }
       }else{
           System.out.println("输入不合法！");
       }*/

        boolean result=n%2==0&&n>50;
        if(result){
            System.out.println(n+"是一个偶数并且大于50，因此是牛妹数，输出yes");
        }else if(n<1||n>100){
            System.out.println("输入不合法");
        }else{
            System.out.println(n+"不是牛妹数，输出no");
        }
    }
}
