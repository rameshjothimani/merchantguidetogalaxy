package com.merchantguide.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MerchantGuideProcessor {

    public static void main(String args[]){

    String filePath="//media//Java//WORKSPACE//designpattern//src//main//java//com//merchantguide//practice//input.txt";

    ReadInputAndProcess readInputAndProcess=new ReadInputAndProcess();
    readInputAndProcess.readFileAndProcess(filePath);

    }

}
