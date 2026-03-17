package com.company.variable;

public class VariabbleDemo2 {
    public static void main(String[] args) {
        double blood1=1012.5;
        int attack1 =220;
        double power1 =1.2;
        int defence1 =85;
        int defence2 =80;
        double blood2=1223.3;
        double power2 =1.3;
        double damage1=attack1-defence2;
        blood2=blood2-damage1;
        System.out.println(blood2);

        double damage2=attack1*power1-defence2;
        blood2=blood2-damage2;
        System.out.println(blood2);


    }
}
