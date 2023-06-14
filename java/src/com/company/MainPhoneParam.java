package com.company;

public class MainPhoneParam {

    class memory{
        String memory = "Off";
        public void working(){
            memory = "ON";
            System.out.println(memory);
        }
        public void notworking(){
            memory = "Off";
            System.out.println(memory);
        }
    }
    class cpu{
        String cpu = "Off";
        public void working(){
            cpu = "ON";
            System.out.println(cpu);
        }
        public void notworking(){
            cpu = "Off";
            System.out.println(cpu);
        }

    }
    memory ram = new memory();
    cpu A15 = new cpu();
}
