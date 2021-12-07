package com.letscode.ex2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        System.out.println("Digite um número inteiro: ");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        for (int i = 0; i < 11; i++) {
            int operation = i * number;
            System.out.printf("%d x %d = %d\n",number, i, operation);
        }
    }
}
