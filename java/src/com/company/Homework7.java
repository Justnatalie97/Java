package com.company;

import java.util.Arrays;

public class Homework7 {
    public static void main(String[] args) {
        // создать массив в пределах от 15 до 15 и поместить туда 10 случайных значений
        // Найти наибольшее и наименьшее значение среди этого массива
        // не сортируя массив
        int[] array = new int[10];
        for(int i = 0; i<array.length; i++){
            array[i]= ((int)(Math.random()*31)-15);
        }
        System.out.println(Arrays.toString(array));
        int max,min;
        max=min= array[0];
        for(int i= 0; i < array.length; i++){
            if (array[i]> max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}

