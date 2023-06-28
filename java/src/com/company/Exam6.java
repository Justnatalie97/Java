package com.company;

public class Exam6 {
    public static void main(String[] args) {
        int[] str = {100,200,300,400,500,600,700,800,900,1000};
        Exam6_2 product = new Exam6_2("Strawberry",str[6] , 4  );
        System.out.println(product.name  + "\n" + product.weight + "g \n" + product.price + " eur");
    }
}
