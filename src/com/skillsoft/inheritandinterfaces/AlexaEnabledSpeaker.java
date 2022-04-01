package com.skillsoft.inheritandinterfaces;

public class AlexaEnabledSpeaker extends SmartSpeaker {

    public AlexaEnabledSpeaker(String productName){
        super(productName);
    }

    @Override
    public void wakePhrase(){
        System.out.println("Wake phrase: Alexa");
    }

    @Override
    public void printDetails(){
        System.out.println("AlexaEnabledSpeaker class: " + getProductName());
    }
}
