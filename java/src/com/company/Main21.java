package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main21 {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter number of month:");
        int month = scn.nextInt();
        if (month > 12) {
            System.out.println("Error");
        } else if (month < 1) {
            System.out.println("Error");
        } else {
            System.out.println(months[month-1]);
        }
    }
}