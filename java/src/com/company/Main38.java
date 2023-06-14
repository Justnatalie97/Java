package com.company;

import java.util.HashMap;

public class Main38 {
    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("Estonia", "Tallinn");
        capitals.put("Latvia", "Riga");
        capitals.put("France", "Paris");
        System.out.println(capitals);

        System.out.println(capitals.get("Latvia"));

        for(String i: capitals.keySet()){
            System.out.println(i);
        }
        for(String i: capitals.values()){
            System.out.println(i);
        }
  //      capitals.remove("France");
   //     capitals.clear();
   //     System.out.println(capitals);
        HashMap<String, Integer> namesage = new HashMap<>();
        namesage.put("Bob",55);
        namesage.put("John",35);
        namesage.put("Lee",28);
        namesage.put("Ronnie",12);
        namesage.put("Mark",19);

        float sum = 0;
        for(int i:namesage.values() ){
            sum+=i;
        }
        float avg = sum/namesage.size();
        System.out.println(avg);
    }
}
