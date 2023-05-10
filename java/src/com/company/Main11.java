package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main11 {
    public static void main (String[] args){
    //vsjo ravno skolko znachenij v skobkah
        int[] array = {5,10,15,20,0,-1};
        System.out.println(array[4]);
    // opredeljonnoe kol-vo znachenij
        int[] array2 = new int[] {10,10,20,30,50,4,-5};
        System.out.println(array2[4]);
        System.out.println(Arrays.toString(array));
        int [][] array3 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(array3[2][0]);

        int[] array4 = new int[5];
        array4[0] = 5;
        array4[1] = 10;
        array4[2] = 65;
        array4[3] = 10;
        array4[4] = 25;
        System.out.println(Arrays.toString(array4));
    }
}
