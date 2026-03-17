package com.company.ifdemo;
import java.util.Scanner;
public class ifDemo5 {
    public static void main(String[] args){
        //卡拉兹函数：给定正整数n，如果为奇数则f（n）=3n+1
        //如果为偶数则f（n）=n/2


        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int n=sc.nextInt();
        /*
        if(n%2==0){
            System.out.println(n+"是一个偶数，输出为:");
            int result=n/2;
            System.out.println(result);
        }else{
            System.out.println(n+"是一个奇数，输出为:");
            int result=3*n+1;
            System.out.println(result);

        }*/

        int result=n%2==1?n*3+1:n/2;
        System.out.println(result);


    }

}
