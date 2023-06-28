package com.company;

public class Exam1 {
    public static void main(String[] args) {
Exam1_2 car1 = new Exam1_2("BMW", "218 i", "White");
Exam1_2 car2 = new Exam1_2();
car2.mark = "Audi";
car2.model = "Q7";
car2.colour = "Black";
        System.out.println(car1.mark + " " + car1.model + " " + car1.colour);
        System.out.println(car2.mark + " " + car2.model + " " + car2.colour);
    }
}
