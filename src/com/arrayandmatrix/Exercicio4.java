package com.arrayandmatrix;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char runAgain = 'S';
        while (runAgain == 'S') {
            int NUMBER_OF_NUMBERS = 5;
            int[] numbers = new int[NUMBER_OF_NUMBERS];
            for (int i = 0; i < NUMBER_OF_NUMBERS; i++) {
                System.out.println("Digite um número:");
                numbers[i] = input.nextInt();
            }
            int higherNumber = numbers[0];
            int smallerNumber = numbers[0];
            float averageNumerator = 0f;
            float cont = 0f;
            for (int number : numbers) {
                if (number > higherNumber) {
                    higherNumber = number;
                }
                if (number < smallerNumber) {
                    smallerNumber = number;
                }
                averageNumerator += number;
                cont++;
            }
            float average = averageNumerator / cont;

            System.out.println("Maior número: " + higherNumber);
            System.out.println("Menor número: " + smallerNumber);
            System.out.println("Média: " + average);
        System.out.println("Digite S para rodar o programa novamente: ");
        runAgain = input.next().toUpperCase().charAt(0);
        }
    }
}
