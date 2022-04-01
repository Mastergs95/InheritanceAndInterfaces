package com.skillsoft.inheritandinterfaces;

public class SonosOne extends AlexaEnabledSpeaker{
    public SonosOne(){
        super("SonosOne");
    }

    @Override
    public void printDetails(){
        System.out.println("SonosOne class: " + getProductName());
    }
}
