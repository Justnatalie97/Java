package com.company;

public class Exam5 {
    public static void main(String[] args) {
        int random = (int)Math.round(Math.random()*100);
        System.out.println(random);
        System.out.println(randomNum(random));
    }public static boolean randomNum(int value){
        if(value>50){
            return true;
        }else{
            return false;
        }
    }
}
