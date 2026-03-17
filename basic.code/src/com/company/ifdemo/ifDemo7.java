package com.company.ifdemo;
import java.util.Scanner;
public class ifDemo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入充值金额");
        int charge = sc.nextInt();
        int balance = 0;
        if (charge >= 0) {
            if (charge >= 1000) {
                if (charge < 2000) balance = charge + 200;
                else if (charge >= 2000 && charge < 3000) balance = charge + 500;
                else if (charge >= 3000 && charge < 5000) balance = charge + 700;
                else if (charge >= 5000 && charge < 10000) balance = charge + 1300;
                else if (charge >= 10000 && charge < 20000) balance = charge + 2500;
                else if (charge >= 20000 && charge < 50000) balance = charge + 6000;
                else if (charge >= 50000) balance = charge + 15000;
            } else balance = charge;


        }else System.out.println("输入不合法");

        System.out.println("您的充值余额为："+balance);
    }
}

