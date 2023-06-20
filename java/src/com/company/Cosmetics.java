package com.company;

public class Cosmetics {
    //создать класс косметика , нужно слелать 2класса декоративная и уходовая вложеные и классы наследники
    public static void main(String[] args) {
        Makeup Cosmetic = new Makeup("Eyeshadow", "Lipstick","BB cream", "Eyebrow pencil", "Day");
        FaceCare Care = new FaceCare("Micellar Cleansing Water", "lip mask", "Peeling Gel", "Patches");
        System.out.println(Cosmetic.eyes + ", " + Cosmetic.lips + ", " + Cosmetic.skin + ", " + Cosmetic.brows + ", " + Cosmetic.whichMakeup);
        System.out.println(Care.cleansers + ", " + Care.lipCare + ", " + Care.skinCare + ", " + Care.eyeCare);

    }
}
