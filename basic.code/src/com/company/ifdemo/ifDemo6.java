package com.company.ifdemo;

import java.util.Scanner;

public class ifDemo6 {
    public static void main(String[] args) {
        //以下为优惠券：
        /*全场商品满10-8
        全场商品满50-30
        全场商品满100-50
        全场商品满200-90
        会员卡：全场8折
        会员卡不能享受优惠券。最优惠价格是多少
        */


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入花费金额");
        int price = sc.nextInt();

        if (price < 0) {
            System.out.println("输入不合法");
        } else {
            double cardPrice = 0.8 * price;
            double couponPrice = price;

            if (price >= 10 && price < 50) couponPrice = price - 8;
            else if (price >= 50 && price < 100) couponPrice = price - 30;
            else if (price >= 100 && price < 200) couponPrice = price - 50;
            else if (price >= 200) couponPrice = price - 90;

            if (couponPrice < cardPrice) System.out.println(price + "元时最优惠价格是使用优惠券，价格为" + couponPrice);
            else if (couponPrice > cardPrice)
                System.out.println(price + "元时最优惠价格是使用会员卡，价格为" + cardPrice);
            else System.out.println(price + "元时使用会员和优惠券价格一样，价格为" + cardPrice);
        }

    }
}
