package com.company;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main29 {
    public static void main(String[] args) {
       int[] array = {1,2,3,4,5};
       int sum = 0;
       // pervõj sposob
       for(int  i = 0;i< array.length;i++){
           sum += array[i];
       }
        System.out.println(sum);
       // vtoroj sposob
       int sum2 = 0;
       int i = 0;
       while(true){
           sum2 += array[i];
           i++;
           if(i == array.length){
               break;
           }
       }
        System.out.println(sum2);
       // tretij sposob
        int sum3 = 0;
        for(int num:array){
            sum3 += num;
        }
        System.out.println(sum3);

        //chetvertõj sposob

        IntStream elements = IntStream.of(array);
        int sum4 = elements.sum();
        System.out.println(sum4);

        // pjatõj sposob
        // int sum5 = Arrays.stream(array).sum();
        //System.out.println(sum5);
        System.out.println(Arrays.stream(array).sum());
    }
}
