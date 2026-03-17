package com.company.controllerloop;

public class ContinueDemo2 {
    //循环打印1-100，数字包含7或者是7的倍数则输出“过”
    public static void main(String[] args){
        for(int i=1;i<=100;i++){
            if(i%7==0||i/10%10==7||i%10==7) {
                System.out.print("过"+" ");
                continue;
            }
            else{
                System.out.print(i+" ");
            }
        }


    }
}
