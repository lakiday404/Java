package com.company.variable;
//确定scanner位置
import java.util.Scanner;

public class VariableDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Scanner可以接受键盘录入的整数，小数，字符串
        int num=sc.nextInt();
        System.out.println(num);

        double num1=sc.nextDouble();
        System.out.println(num1);

        String name=sc.next();
        System.out.println(name);

        char ch=sc.next().charAt(0);
        System.out.println(ch);

        boolean flag=sc.nextBoolean();
        System.out.println(flag);

    }
}
