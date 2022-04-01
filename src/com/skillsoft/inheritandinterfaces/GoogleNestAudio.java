package com.skillsoft.inheritandinterfaces;

public class GoogleNestAudio extends SmartSpeaker {

    public GoogleNestAudio(){
        super("Google Nest Audio");
    }

    public void wakePhrase(){
        System.out.println("Wake phrase: Ok Google");
    }
}
