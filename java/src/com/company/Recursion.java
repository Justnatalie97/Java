package com.company;

public class Recursion {
    public static void main(String[] args) {
         int result = sum(15);
        System.out.println(result);

    }
    public static int sum(int num){
        if(num>0){
            return num + sum(num-2);
        }else{
            return 0;
        }
    }
}
