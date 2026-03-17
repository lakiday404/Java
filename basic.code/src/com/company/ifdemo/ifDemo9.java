package com.company.ifdemo;
import java.util.Scanner;
public class ifDemo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入横坐标：");
        double x = sc.nextDouble();
        System.out.println("请输入纵坐标：");
        double y = sc.nextDouble();


        if (x == 0 && y == 0) System.out.println("该点在原点上");
        else if(x>0&&y>0) System.out.println("该点位于第一象限");
        else if(x>0&&y<0) System.out.println("该点位于第四象限");
        else if(x<0&&y>0) System.out.println("该点位于第二象限");
        else if(x<0&&y<0) System.out.println("该点位于第三象限");
        else if(x==0&&y!=0) System.out.println("该点位于y轴上");
        else if(x!=0&&y==0) System.out.println("该点位于x轴上");

    }
}
