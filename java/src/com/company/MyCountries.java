package com.company;

public class MyCountries implements Capitals{
    String capital;

    MyCountries(){

    }
    MyCountries(String capital){
        this.capital = capital;
    }

    @Override
    public void country(String country) {
        System.out.println(capital + " is the capital of " + country );

    }
}
