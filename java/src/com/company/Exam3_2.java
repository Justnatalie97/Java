package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exam3_2 implements Exam3Interface {
    int value = (int) Math.round(Math.random() * 5);

    @Override
    public void play(int num) {
        if (num == 1) {
            System.out.println("guitar");
        } else if (num == 2) {
            System.out.println("drum");
        } else if (num == 3) {
            System.out.println("flute");
        } else if (num == 4) {
            System.out.println("guitar + drum");
        } else if (num == 5) {
            System.out.println("drum + flute");
        } else {
            System.out.println("Wrong number");
        }
    }

}



