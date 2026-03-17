package com.company.loopfor;
import java.util.Scanner;
public class forDemo4 {
    public static void main(String[] args){
        // 键盘录入两个数字表示范围，既能被3整除，又能被5整除的数字有多少个


        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数");
        double left=sc.nextDouble();
        System.out.println("请输入第二个数");
        double right=sc.nextDouble();
        double max=left>right?left:right;
        double min=left<right?left:right;




            int count=0;                                //count来统计多少个符合要求的数字
            String numbers="";                          //String number=" "来存储每个符合要求的数字，
                                                        //并以字符串的形式保存，""之间加个空格，使得输出的时候更好看

            for(int i=(int)min;i<=max;i++){          //强制转换left，使其向下取整，int i=(int)left
                if(i%3==0&&i%5==0){
                    count++;
                    numbers+=i+" ";
                }
            }
            if(count==0){
                System.out.println("在"+min+"~"+max+"之间没有满足的数字");
            }else{
                System.out.println("既能被3整除，又能被5整除的数字有"+count+"个");
                System.out.println("这些数字依次是"+numbers);
            }

        }

    }


