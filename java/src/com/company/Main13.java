package com.company;

public class Main13 {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,12,543,814,37,184,615478,146,754};
        float result = 0;
        for(int i =0; i< array.length; i++){
            result = array[i] + result;
        }
        System.out.println(result);
        float  average  = result / array.length;
        System.out.println(average);

    }
}
