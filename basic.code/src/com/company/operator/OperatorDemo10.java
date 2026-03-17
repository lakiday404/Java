package com.company.operator;
import java.util.Scanner;
public class OperatorDemo10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
//利用三元运算符求两个整数的较大值

        System.out.println("输入2个数字");
        double a=sc.nextDouble();
        double b=sc.nextDouble();

       double max= a>=b?a:b;
       System.out.println("较大值是"+max);




        System.out.println();
    }
}
