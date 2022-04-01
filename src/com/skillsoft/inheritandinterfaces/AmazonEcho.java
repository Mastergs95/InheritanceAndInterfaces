package com.skillsoft.inheritandinterfaces;

public class AmazonEcho extends AlexaEnabledSpeaker{

    public AmazonEcho(){

        super("AmazonEcho");
    }


    @Override
    public void wakePhrase(){
        System.out.println("Wake phrase: Hey Alexa");
    }

    @Override
    public void printDetails(){
        System.out.println("AmazonEcho class:" + getProductName());
    }
}
