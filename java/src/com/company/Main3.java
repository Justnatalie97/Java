package com.company;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] srgs){
//        Scanner scn = new Scanner(System.in);
//        int num1, num2, result;
//        System.out.println("Plese enter first number: ");
//        num1 = scn.nextInt();
//        System.out.println("Please enter second number:");
//        num2 = scn.nextInt();
//        result = num1 + num2;
//        System.out.println("Sum of two numbers is" + result) ;

        Scanner scn = new Scanner(System.in);
        float num1,num2,result;
        System.out.println("Please enter first number:");
        num1 = scn.nextFloat();
        System.out.println("Please enter second number:");
        num2 = scn.nextFloat();
        result = num1 + num2;
        System.out.println("Sum of two number is " + result);
    }
}
