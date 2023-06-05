package com.company;

import java.io.File;

public class Deliter {
    public static void main(String[] args) {
        try {
            File file = new File("src/com/company/Natalja.txt");
            //file.delete();
            if(file.exists()){
                if(file.delete()){
                    System.out.println("Delete");
                }else{
                    System.out.println("Error!");
                }
                }else{
                System.out.println("Pathname is wrong!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
