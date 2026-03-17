package com.company.controllerloop;
import java.util.Scanner;
public class BreakDemo3 {
    public static void main(String[] args){
        //键盘录入一个大于等于2的整数，判断是否为质数
        Scanner sc=new Scanner(System.in);
        int n=0;
        while(true){
            System.out.println("请输入一个大于等于2的整数");
            n= sc.nextInt();
            if(n>=2) {
                break;
            }
            else {
                System.out.println("当前录入的数字不合法，请重新输入");
            }
        }
        //判断n记录的是否为一个质数
        int count=0;
        for (int i = 2; i <Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println(n+"是质数");
        }
        else {
            System.out.println(n+"不是质数");
        }

        }

    }

