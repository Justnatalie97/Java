package com.company;

import java.util.Arrays;

public class Homework2_2 {
   public static void main(String[] args) {
       String[] array = {"K", "O", "Z", "Z", "G", "S", "F", "1"};
       //OUT ["F", "S"´,"G", "Z", "Z", "O",  "K"]
       // BEZ VSPOMOGATELNOGO MASSIVA
       System.out.println(Arrays.toString(array));
       String temp;
       for(int i = 0; i< array.length/2; i++){
           temp = array[array.length-i-1];
           array[array.length-i-1] = array[i];
           array[i] = temp;

       }
       System.out.print(Arrays.toString(array));
   }
}