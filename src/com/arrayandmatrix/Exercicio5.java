package com.arrayandmatrix;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char runAgain = 'S';
        while(runAgain == 'S') {
            int NUMBER_OF_GUESTS = 5;
            String[] guestList = new String[NUMBER_OF_GUESTS];
            String longerName = "";
            for (int i = 0; i < NUMBER_OF_GUESTS; i++) {
                System.out.println("Insira o nome do convidado: ");
                guestList[i] = input.nextLine();
                if (guestList[i].length() > longerName.length()) {
                    longerName = guestList[i];
                }
                System.out.println(guestList[i].length());
                System.out.println(longerName);
            }

            System.out.println("O maior nome da lista é " + longerName);

            System.out.println("\n----------------------------------------------\n"
                    +"Digite S se desejar rodar o programa novamente: ");
            runAgain = input.next().toUpperCase().charAt(0);

        }
    }
}
