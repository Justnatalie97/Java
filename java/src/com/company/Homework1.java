package com.company;

public class Homework1 {
    public static void main(String[] args) {
        //EVEN 2 4 5 6 8 10 12 ...50
        //ODD 1 3 5 7 9 11 13 ...49

        System.out.print("EVEN" + "\t");
            for (int i = 2; i <= 50; i += 2){
            System.out.print(i + "\t" );
        }
        System.out.print("\n" + "ODD" + "\t");
            for(int j = 1; j<= 49; j+=2){
                System.out.print(j + "\t");
            }

        }

    }





