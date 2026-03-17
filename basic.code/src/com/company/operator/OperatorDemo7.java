package com.company.operator;
import java.util.Scanner;
public class OperatorDemo7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //键盘录入一个三位数，判断能否被3整除
        System.out.println("请输入一个三位数");
        int number=sc.nextInt();

        int ge=number%10;
        int shi=number/10%10;
        int bai=number/100;

        int sum=ge+shi+bai;

        boolean result=sum%3==0;
        System.out.println(result);
    }

}

