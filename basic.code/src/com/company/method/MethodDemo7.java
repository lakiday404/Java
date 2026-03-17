package com.company.method;

import java.lang.reflect.GenericDeclaration;
import java.util.Scanner;

public class MethodDemo7 {
    //快递公司运费规则如下：（首重1kg，超出部分按kg计算，不足1kg按1kg算
    //首重：1kg：10元
    //超出1-5kg：每kg加2
    //超出5kg：每kg加1.5
    //键盘录入小数，表示快的重量，计算最终结果
    //要求快递重量必须大于0，否则重新输入
    //不同价位的计算单独定义一个方法
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入快递的重量：");
       double weight=0;
        while(true){
            weight=sc.nextDouble();
            if(weight>0){
                break;
            }else{
                System.out.println("重量必须大于0!");
            }
        }
        int total= calculatePrice(weight);
        System.out.println("快递重量"+weight+"kg,运费："+total+"元");
    }
    public static int lv1(){
        return 10;
    }
    public static int lv2(int weight){
        return 10+2*(weight-1);
    }
    public static int lv3(int weight){
        return 10+4*2+(weight-5)*1;
    }

    public static int calculatePrice(double weight){
        int chargeWeight=(int)Math.ceil(weight);
        if(chargeWeight<=1){
            return lv1();
        }else if(chargeWeight<=5){
            return lv2(chargeWeight);
        }else{
            return lv3(chargeWeight);
        }
    }









}
