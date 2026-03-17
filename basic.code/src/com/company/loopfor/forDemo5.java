package com.company.loopfor;
import java.util.Scanner;
public class forDemo5 {
    public static void main(String[] args){
        //一组数字，从第三项开始，每一项都是前两项的数字和，请问第10项数字是多少
        //假如是键盘输入一个数x，求x是多少呢？
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第几项：");
        int x=sc.nextInt();
        if(x>0) {
            if (x == 1) System.out.println("第1项为0");
            else if (x == 2) System.out.println("第2项为1");
            else{
                int exfront=0;
                int front=1;
                int current=0;
                for( int count=3;count<=x;count++){
                    current=exfront+front;
                    exfront=front;
                    front=current;
                    if(count==x){
                        System.out.println("第"+count+"项为"+current);
                    }
                }
            }
        }else System.out.println("输入不合法");
    }
}
