package com.services;

import java.util.Locale;
import java.util.Scanner;

public class Services {

    public static String[] setDatainStringArray(int arrayLength, String[] array, String message){
        Scanner input = new Scanner(System.in);
        for(int i=0; i < arrayLength; i++){
            System.out.println(message);
            String dataOFArray = input.next();
            array[i] = dataOFArray;
        }
        return array;
    }

    public static String wordInverter(String word){
        String[] wordArray = word.split("");
        String[] invertedWord = new String[wordArray.length];
        int cont = 0;
        for(int i = (wordArray.length-1); i >= 0; i--){
            invertedWord[cont] = wordArray[i];
            cont++;
        }
        String invertedWordString = String.join("", invertedWord);

        return invertedWordString.toLowerCase();
    }
}
