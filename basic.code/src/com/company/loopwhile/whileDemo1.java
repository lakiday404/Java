package com.company.loopwhile;

public class whileDemo1 {
    public static void main(String[] args){
        //存入100000，复利1.7%，多少年后能本金翻倍
        double current=100000;
        int year=0;
        double rate=0.017;
        while(current<200000){
            current=current*(1+rate);
            year++;
        }
        System.out.println(year);
    }


}
