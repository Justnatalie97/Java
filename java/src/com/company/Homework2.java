package com.company;
import java.io.OptionalDataException;
import java.util.Arrays;
import java.util.Collections;

public class Homework2 {

    public static <string> void main(String[] args) {
        String[] array = {"K", "O", "Z", "Z", "G", "S", "F"};
        //OUT ["F", "S"´,"G", "Z", "Z", "O",  "K"]
        // BEZ VSPOMOGATELNOGO MASSIVA
        System.out.println(Arrays.toString(array));
        for (int s = array.length - 1; s > 0; s--) {
            System.out.print(array[s] +", ");


        }

    }
}






