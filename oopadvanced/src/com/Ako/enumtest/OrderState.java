package com.Ako.enumtest;

public enum OrderState {
    //这个类所有的对象,在枚举类的第一行罗列出来
    PAYMENT_PENDING("待支付"),
    PROCESSING("处理中"),
    SHIPPED("已发货"),
    OUT_FOR_DELIVERY(" 配送中"),
    DELIVERED("已送达"),
    CANCELLED("已取消");



    private String name;
//private不让外界创建对象,枚举默认用private修饰
    //这里省略不写也没关系，java虚拟机会自动加上
    private OrderState(String name) {
        System.out.println("看看我执行了没"+name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /*不需要setName
    public void setName(String name) {
        this.name = name;
    }*/



}
