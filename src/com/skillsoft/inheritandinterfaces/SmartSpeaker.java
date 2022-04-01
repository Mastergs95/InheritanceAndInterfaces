package com.skillsoft.inheritandinterfaces;

import java.util.concurrent.RecursiveTask;

public class SmartSpeaker {

    private String productName="unknown";

    public SmartSpeaker(String productName){
        this.productName=productName;
    }

    public String getProductName(){
        return productName;
    }

    public void wakePhrase(){
        System.out.format("Activities on saying %s's wake phrase. \n",productName);
    }

    public void printDetails(){
        System.out.println("SmartSpeaker class: " + getProductName());
    }
}
