package com.company.looploop;


public class Parallelogram {
    public static void main(String[] args){
//打印一个平行四边形
        //外循环：控制图形行数
        for(int i=0;i<3;i++){
            //内循环：控制每一行打印多少个*
            for(int z=i;z<=2;z++){
                System.out.print(" ");
            }
            //内循环：平行四边形
            for(int j=0;j<6;j++){
                System.out.print("*");
            }


            System.out.println();
        }
    }
}
