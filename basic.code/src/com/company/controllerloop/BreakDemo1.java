package com.company.controllerloop;

public class BreakDemo1 {
    public static void main(String[] args){
        //循环的快速写法：fori+回车
        for (int i = 0; i < 100; i++) {
            if(i==15) break;
            System.out.print(i+" ");
        }
    }
}
