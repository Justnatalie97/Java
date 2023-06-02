package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Locale;

public class Reader {
    public static void main(String[] args) {
        BufferedReader file = null;
        String[] array;
        int count;
        int word;
        String formattedLine;
        try{
            file = new BufferedReader(new FileReader("src/com/company/test.txt"));
            String line;
            while((line = file.readLine()) != null){
                count = 0;
                word = 0;
                System.out.println(line);
                formattedLine = line.toLowerCase();
                array = formattedLine.split(" ");
                for(int i =0;i<line.length();i++){
                    if(formattedLine.charAt(i) == 'a'){
                        count++;
                    }

                }
                for(int i =0; i< array.length;i++){
                    if(array[i].equals("christmas")){
                        word++;
                    }
                }
                System.out.println(Arrays.toString(array));
                System.out.println(count);
                System.out.println("Christmas " + word);
            }
        }catch (Exception e){
            System.out.println("Error" + e);
        }
    }
}
