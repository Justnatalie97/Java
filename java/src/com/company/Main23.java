package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main23 {
    public static void main(String[] args) {
        int count = 0;
        int totalLetters = 0;
        int totalWords = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Please write some sentences or word:");
        String someString = scn.nextLine();
        System.out.println("Please write some character");
        char someChar = scn.next().charAt(0);
        String[] array = someString.split(" ");
        for(int i = 0; i< someString.length(); i++){
            if(someString.charAt(i) == someChar){
                count++;
            }
             if(someString.charAt(i) != ' '){
                 totalLetters++;
            }
        }
        for(String word: array){
            if(!word.equals("")){
                totalWords++;
            }
        }
        System.out.println(totalWords);
        //System.out.println(Arrays.toString(array));
        System.out.println(totalLetters);
        System.out.println("In a word/sentences '" + someString + "' character seems " + count + " time(s)");

    }
}
