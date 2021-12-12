package com.arrayandmatrix;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int NUMBER_OF_PEOPLE = 5;
        int NUMBER_OF_CHARACTERISTICS = 4;
        int NAME = 0;
        int HEIGHT = 1;
        int WEIGHT = 2;
        int IMC = 3;
        String[][] people = new String[NUMBER_OF_PEOPLE][NUMBER_OF_CHARACTERISTICS];
        ArrayList<String[]> lowIMC = new ArrayList();
        ArrayList<String[]> highIMC = new ArrayList();

        for(int i = 0; i < NUMBER_OF_PEOPLE;i++){
            System.out.printf("-Pessoa %d\n", (i+1));
            for(int j = 0; j < (NUMBER_OF_CHARACTERISTICS - 1); j++){
                String inputString = returnInputString(j);
                System.out.println(inputString);
                people[i][j] = input.next();
            }
            float height = Float.parseFloat(people[i][HEIGHT]);
            float weight = Float.parseFloat(people[i][WEIGHT]);
            double imc = imcCalculator(height, weight);
            people[i][IMC] = Double.toString(imc);
            if(imc < 18.5){
                lowIMC.add(people[i]);
            }
            if(imc > 25){
                highIMC.add(people[i]);
            }
        }
        System.out.println("-------------------------------");
        System.out.println("Pessoas com IMC abaixo da média");
        System.out.println("-------------------------------");
        lowIMC.forEach(person -> {
            System.out.println("\n----------------\n");
            System.out.println("Nome:" + person[NAME] +
                    "\nAltura: "+ person[HEIGHT] +
                    "\nPeso: " + person[WEIGHT]+
                    "\nIMC: " + person[IMC]
                    );

        });
        System.out.println("-------------------------------");
        System.out.println("Pessoas com IMC acima da média");
        System.out.println("-------------------------------");
        highIMC.forEach(person -> {
            System.out.println("\n----------------\n");
            System.out.println("Nome:" + person[NAME] +
                    "\nAltura: "+ person[HEIGHT] +
                    "\nPeso: " + person[WEIGHT]+
                    "\nIMC: " + person[IMC]
            );
        });
    }
    public static String returnInputString(int characteristic){
        String inputString = "";

        if(characteristic == 0){
            inputString = "Insira o nome da pessoa: ";
        }else if(characteristic == 1){
            inputString = "Insira a altura da pessoa: ";
        }else{
            inputString = "Insira o peso da pessoa: ";
        }
        return inputString;
    }

    public static double imcCalculator(float heigth, float weigth){
        double imc = weigth / Math.pow(heigth, 2);
        return imc;
    }

}


