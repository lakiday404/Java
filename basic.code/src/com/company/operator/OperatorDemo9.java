package com.company.operator;
import java.util.Scanner;
public class OperatorDemo9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
//键盘录入一个2位整数，判断这个数字是不是7的有缘数（包含7或者为7的倍数）

        System.out.println("输入一个2位整数");
        int number=sc.nextInt();

        int ge=number%10;
        int shi=number/10%10;

        boolean result=(ge==7)||(shi==7)||(number%7==0);


        System.out.println(result);
    }
}
