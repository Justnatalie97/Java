package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exam3_2 implements Exam3Interface {
    int value = (int) Math.round(Math.random() * 5);

    @Override
    public void play() {
        if (value == 1) {
            System.out.println("guitar");
        } else if (value == 2) {
            System.out.println("drum");
        } else if (value == 3) {
            System.out.println("flute");
        } else if (value == 4) {
            System.out.println("guitar + drum");
        } else if (value == 5) {
            System.out.println("drum + flute");
        } else {
            System.out.println("Wrong number");
        }
    }

}



