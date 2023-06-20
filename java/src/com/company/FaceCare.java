package com.company;

public class FaceCare extends SkinCare{
    public String lipCare;
    public String skinCare;
    public String eyeCare;
    FaceCare(String cleansers, String lipCare, String skinCare, String eyeCare){
        super(cleansers);
        this.lipCare = lipCare;
        this.skinCare = skinCare;
        this.eyeCare = eyeCare;
    }
}
