package com.company;

public class Main24 {
    public static void main(String[] args) {
        // ne dolzno bqtj ravno nulju
        int[] numbers = {35,6,4,10,651,154683,254,12,-54873, -241,-4531,-1254};
        int max, min;
        max=min=numbers[0];
        for(int i= 0; i < numbers.length; i++){
            if (numbers[i]> max){
                max = numbers[i];
            }
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
