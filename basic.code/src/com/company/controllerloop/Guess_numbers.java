package com.company.controllerloop;
import javax.sound.midi.SoundbankResource;
import java.util.Random;
import java.util.Scanner;
public class Guess_numbers {
    //生成一个1-100的随机数，键盘输入一个数来猜
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //注意随机数和Scanner一样。都要import引用
        Random random=new Random();
        //int a=random.nextInt(100)+1;表示从一到一百范围生成一个随机数
        int randomNum=random.nextInt(100)+1;
        int count=0;
        System.out.println("你想猜几次呢？");
        int Maxcount=sc.nextInt();

        while(count<Maxcount){
            //请猜一个1-100的数，我只想让它输出一次
            if(count==0) System.out.println("请猜一个1-100数字：");
            int number=sc.nextInt();
            //count++不可以放在这里，要先执行不合法的重新来过
            if(number<1||number>100){
                System.out.println("输入不合法,本次机会不算");
                continue;
            }
            //合法输入则开始计数
            count++;

            if(number==randomNum){
                System.out.println("你猜对了!");
                break;
            } else if(number>randomNum){
                System.out.println("太大了，再猜一次吧");
            }else if(number<randomNum){
                System.out.println("太小了，再猜一次吧");
            }
        }
        System.out.println("游戏结束");
        sc.close();
    }
}
