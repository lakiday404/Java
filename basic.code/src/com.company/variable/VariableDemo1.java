package com.company.variable;

public class VariableDemo1 {
    public static void main(String[] args){
        //微信0，支付宝10，信用卡20
        double wechatbalance= 0;
        double Alipaybalance=10;
        double creditcardbalance=20;
        System.out.println(wechatbalance+Alipaybalance+creditcardbalance);
    //微信收到10元红包
        wechatbalance=wechatbalance+10;
        System.out.println(wechatbalance);

    }
}
