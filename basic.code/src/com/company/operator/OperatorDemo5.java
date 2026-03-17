package com.company.operator;
import java.util.Scanner;
public class OperatorDemo5 {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("请输入一个大写字符");


         //实现字母大小写转换，大转小, A与a差32
        char c=sc.next().charAt(0);
        char cc=(char)(c+32);
        System.out.println(cc);





    }
}
