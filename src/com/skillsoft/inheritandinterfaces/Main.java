package com.skillsoft.inheritandinterfaces;


public class Main {
    public static void main(String [] args){

        SmartSpeaker smartSpeaker=new SmartSpeaker("Google Nest");
        AlexaEnabledSpeaker alexaEnabledSpeaker=new AlexaEnabledSpeaker("Amazon Echo");
        AmazonEcho amazonEcho= new AmazonEcho();
        AppleHomePod appleHomePod = new AppleHomePod();

        printWakePhrase(amazonEcho);
        printWakePhrase(appleHomePod);



    }
    private static void printWakePhrase(SmartSpeaker speaker){
        speaker.wakePhrase();
    }
}
