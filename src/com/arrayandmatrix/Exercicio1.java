package com.arrayandmatrix;

import com.services.Services;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char runAgain = 'S';
        while(runAgain == 'S'){
            int NUMBER_OF_FRUITS = 5;
            String[] cart = new String[NUMBER_OF_FRUITS];
            Services.setDatainStringArray(NUMBER_OF_FRUITS, cart, "Escreva o nome da fruta para colocar no carrinho: ");
            System.out.println("Frutas no carrinho:");
            for (String fruit : cart) {
                System.out.println("-" + fruit);
            }
            System.out.println("\n----------------------------------------------\n"
                    +"Digite S se desejar rodar o programa novamente: ");
            runAgain = input.next().toUpperCase().charAt(0);
        }
    }


}
