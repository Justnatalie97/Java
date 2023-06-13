package com.company;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please write which exchange you want to see ( number1 - from euro to dollar, number2 - from dollar to euro, number3 - from euro to ruble, number4 - from ruble to euro)");
        float number;
        number = scn.nextInt();
        boolean isTrue = true;
        while (isTrue) {
            if (number >4) {
                System.out.println("Please try again");
                number = scn.nextInt();
            } else {
                isTrue = false;
            }
        }
        System.out.println("How much do you want to change?");
            float number2;
            number2 = scn.nextInt();
            ;
            if (number == 1) {
                System.out.println(number2 * 1.0611);
            } else if (number == 2) {
                System.out.println(number2 / 1.106);
            } else if (number == 3) {
                System.out.println(number2 * 78.0189);
            } else if (number == 4) {
                System.out.println(number2 / 91.636);
            }
        }
    }


