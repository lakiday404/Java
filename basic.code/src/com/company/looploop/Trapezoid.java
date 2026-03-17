package com.company.looploop;



public class Trapezoid {
    public static void main(String[] args){
        //打印一个梯形
        int count=1;
        for(int i=0;i<3;i++){
            for(int z=i;z<2;z++){
                System.out.print(" ");
            }for(int j=0;j<(count*2+1);j++){
                System.out.print("*");
            }
            count++;
            System.out.println();
        }
    }
}
