package com.company;

public class PhonesDemo3 extends PhonesDemo2 {
    String FM;
    String SdCard;
    PhonesDemo3(){

    }
    PhonesDemo3(String FM, String Sdcard){
        this.FM = FM;
        this.SdCard = Sdcard;
    }
    PhonesDemo3(String model, int memory, String software, String color, int price, String FM, String SdCard){
        super(model,memory,software,color,price);
        this.FM = FM;
        this.SdCard = SdCard;
    }
}
