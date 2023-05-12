package com.company;

import java.util.Arrays;

public class Main14 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        for(int i=0; i < array.length;i++){
            if(array[i] == 3 || array[i] ==5){
                array[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
