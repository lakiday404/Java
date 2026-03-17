package com.company.switchdemo;
import java.util.Scanner;
public class switchDemo3 {
    public static void main(String[] args){

        //用swtich模拟计算器
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入a的值");
        int a=sc.nextInt();
        System.out.println("请输入b的值");
        int b=sc.nextInt();
        System.out.println("请输入要进行的运算");
        String operator=sc.next();

        int result=switch(operator){
            case "+"->a+b;
            case "-"->a-b;
            case "*"->a*b;
            case "/"->a/b;
            default->0;
        };
        System.out.println(result);
    }
}
