package com.company;

public class Main22 {
    public static void main(String[] args) {
        String someString = "Happy new year";
        char someChar = 'a';
        int count = 0;
        for( int i = 0; i < someString.length(); i++){
            if(someString.charAt(i) == someChar){
                count++;
            }
        }
        System.out.println(count);
    }
}
