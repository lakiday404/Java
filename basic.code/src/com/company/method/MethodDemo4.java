package com.company.method;

import javax.sound.midi.SoundbankResource;

public class MethodDemo4 {
    public static void main(String[] args){
        printMulTable();

    }

    //()里啥也不写，表示没有参数的方法
    //调用的时候，实参也是空着的
    public static void printMulTable(){
        for (int i = 1; i <=9; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
