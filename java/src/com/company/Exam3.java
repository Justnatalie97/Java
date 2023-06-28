package com.company;

import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
        Exam3Interface music = new Exam3_2();
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        music.play(num);
        }
}

