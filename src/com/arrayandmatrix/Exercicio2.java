package com.arrayandmatrix;

import java.util.Scanner;
import com.services.Services;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("------Inversor de palavras------\n");
        System.out.println("Digite uma palavra: ");
        String word = input.next();

        String invertedWordString = Services.wordInverter(word);
        System.out.println("Palavra invertida: ");
        System.out.println(invertedWordString);
    }
}
