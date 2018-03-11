package com.merchantguide.practice;



/*This class helps to process the data from input*/

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadInputAndProcess {


    private String UKNOWN_INPUT="I have no idea what you are talking about";
    private List<String> inputQuestions=new ArrayList<String>();
    private List<String> openQuestions=new ArrayList<String>();


    private HashMap<String,RomanNumbers.Roman> galacticMapping=new HashMap<String, RomanNumbers.Roman>();

 /*Read the file contents*/
public void readFileAndProcess(String fileName){

try{
    BufferedReader bufferedReader=new BufferedReader(new FileReader(fileName));

    String line;

    while((line= bufferedReader.readLine())!=null){

        processFileContents(line);
    }

}catch (FileNotFoundException fileNotFoundException){
    System.out.println("File not found !!"+ fileNotFoundException);
}catch(IOException ioException){
    System.out.println("IOException occured !!"+ioException);
}
}


/*Process the file contents line by line*/

private void processFileContents(String line){

    line=line.toLowerCase();

    if(line.startsWith("how much is")){
        line=line.substring(line.indexOf("is")+3,line.indexOf("?")-1);
        openQuestions.add(line);
    }else if(line.startsWith("how many credits is")){
        line=line.substring(line.indexOf("is")+3,line.indexOf("?")-1);
        openQuestions.add(line);
    }else if(line.contains("is") && !line.contains("credits")){
        /*THis means we have direct roman value for the given galactic term*/

    }
}

/*This method maps the galctic term to Roman*/
private void mapGalacticToRoman(){

}
}
