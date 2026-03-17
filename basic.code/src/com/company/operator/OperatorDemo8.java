package com.company.operator;
import java.util.Scanner;
public class OperatorDemo8 {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
//键盘录入一个四位整数，判断这个数字是不是回文数

       System.out.println("输入一个四位整数");
       int number=sc.nextInt();
       int ge=number%10;
       int shi=number/10%10;
       int bai=number/100%10;
       int qian=number/1000%10;

       boolean result=(qian==ge)&&(bai==shi);
       System.out.println(result);
    }
}
