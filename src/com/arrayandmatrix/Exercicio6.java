package com.arrayandmatrix;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char runAgain = 'S';
        while(runAgain =='S'){
            System.out.println("Digite uma palavra para os caracteres impares serem transformados em maiúsculos: ");
            String[] word = input.next().split("");
            for(int i = 1; i < word.length; i++){
                if(i % 2 != 0){
                    word[i] = word[i].toUpperCase();
                }
            }
            System.out.println(String.join("", word));
            System.out.println("\n----------------------------------------------\n"
                    +"Digite S se desejar rodar o programa novamente: ");
            runAgain = input.next().toUpperCase().charAt(0);
        }
    }
}
