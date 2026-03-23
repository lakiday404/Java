package com.Ako.enumtest;

public class EnumTest2 {
    public static void main(String[] args){
        /*OrderState o1=OrderState.PROCESSING;
        System.out.println(o1.getName());*/

        OrderState []arr=OrderState.values();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("--------------------");
        OrderState shipped=OrderState.valueOf("SHIPPED");
        System.out.println(shipped);
        System.out.println("状态名称: " + shipped.getName());
    }
}
