package com.company;

import java.util.Arrays;

public class Homework4 {
    public static void main(String[] args) {
        String str = "Hello Happy new  year    ";
        int length = str.length();
        int index = length - 1;
        while (true) {
            if (str.charAt(index) == ' ') {
                index--;
            } else {
                System.out.println(index);
                break;
            }

        }
    }
}




