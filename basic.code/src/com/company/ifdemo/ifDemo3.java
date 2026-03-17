package com.company.ifdemo;
import java.util.Scanner;
public class ifDemo3 {
    public static void main(String[] args){
        //美团每满30-10，饿了么九折，问哪家更划算
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入订单价格：");
        double price=sc.nextDouble();
        double elm=price*0.9;
        double mt=0;

        if(price>=30){
            int discount=(int)(price/30);
            mt=price-discount*10;
        }else{
            mt=price;
        }
        if(elm<mt){
            System.out.println("应选择饿了么，共花费"+elm+"元");
        }else if(elm>mt){
            System.out.println("应选择美团，共花费 "+mt+"元");
        }else{
            System.out.println("美团与饿了么同等优惠，均为"+mt+"元");
        }

    }
}
