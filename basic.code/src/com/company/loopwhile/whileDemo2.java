package com.company.loopwhile;

public class whileDemo2 {
    public static void main(String[] args){
        //珠穆朗玛峰高度为8848860mm，一张足够大的纸厚度为0.1mm，对折几次可以到珠穆朗玛峰的高度
        double thickness=0.1;
        int times=0;
        while(thickness<8848860){
            thickness*=2;
            times++;
        }
        System.out.println(times);
    }
}
