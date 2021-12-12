package com.arrayandmatrix;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char runAgain = 'S';
        while (runAgain == 'S') {
            int NUMBER_OF_NUMBERS = 5;
            int[] numbers = new int[NUMBER_OF_NUMBERS];
            for (int i = 0; i < NUMBER_OF_NUMBERS; i++) {
                System.out.println("Digite um número: ");
                numbers[i] = input.nextInt();
            }

            ArrayList<Integer> evenNumbers = new ArrayList();
            ArrayList<Integer> oddNumbers = new ArrayList();
            for (int number : numbers) {

                if (number % 2 == 0) {
                    evenNumbers.add(number);
                } else {
                    oddNumbers.add(number);
                }
            }

            System.out.println("Números pares: " + evenNumbers);
            System.out.println("Números impares: " + oddNumbers);
            System.out.println("\n----------------------------------------------\n"
                    +"Digite S se desejar rodar o programa novamente: ");
            runAgain = input.next().toUpperCase().charAt(0);
        }
    }
}
