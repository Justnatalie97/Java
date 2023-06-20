package com.company;

public class Makeup extends DecorativeCosmetics{
   public String whichMakeup;
   Makeup(String eyes, String lips, String skin, String brows, String whichMakeup){
       super(eyes, lips, skin, brows);
       this.whichMakeup = whichMakeup;
   }
}

