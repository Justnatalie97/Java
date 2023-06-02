package com.company;

import java.util.Arrays;

public class Main26_3 {
    public static void main(String[] args) {
        int[] nums = {1,1,5,3,4,43,2,1,6,3,2};
        int max = nums[0];
        int[] nums2;
        int count = 0;
        for(int i =0; i< nums.length;i++){
            if(max<nums[i]){
                max = nums[i];
            }
        }
        int[] temp = new int[max + 1];
        //System.out.println(Arrays.toString(temp) + "\n");
        for(int i =0;i< nums.length;i++){
            temp[nums[i]]++;
            //System.out.println(Arrays.toString(temp));
        }
        for(int i =0; i<temp.length;i++){
            if(temp[i] != 0){
                count++;
            }
        }
        nums2 = new int[count];
        int index = 0;
        for(int i =0; i<temp.length;i++){
            if(temp[i] != 0){
                nums2[index] = i;
                index++;
            }
        }
        System.out.println("nums2  " + Arrays.toString(nums2));
    }
}
