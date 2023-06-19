package com.company;

import java.util.logging.Level;

enum Levels{
   Easy,
   Medium,
    Hard,
    Prof
}
public class Main39 {
    public static void main(String[] args) {
        Levels obj = Levels.Easy;
        switch(obj){
            case Hard:
                System.out.println("Hard");
            case Prof:
                System.out.println("");
            case Medium:
                System.out.println("Medium");
            case Easy:
                System.out.println("Easy");
        }
    }
}
