package com.company;

import java.util.Scanner;

public class Main5 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter value for first number:");
        int first = scn.nextInt();
        switch (first) {
            case 10 -> System.out.println("first is 10");
            case 20 -> System.out.println("first is 20");
            case 0 -> System.out.println("First is 0");
            default -> System.out.println("first number is some number");
        }
    }
}
