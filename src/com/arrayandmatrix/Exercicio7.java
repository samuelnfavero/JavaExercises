package com.arrayandmatrix;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        int NUMBER_OF_PEOPLE = 5;
        int NUMBER_OF_CHARACTERISTICS = 2;
        int NAME = 0;
        int AGE = 1;
        Scanner input = new Scanner(System.in);
        String[][] people = new String[NUMBER_OF_PEOPLE][NUMBER_OF_CHARACTERISTICS];
        String[] higherAgePerson = new String[NUMBER_OF_CHARACTERISTICS];
        int higherAge = 0;
        for(int i = 0; i < NUMBER_OF_PEOPLE; i++){
            for(int j = 0; j < NUMBER_OF_CHARACTERISTICS; j++ ){
                String inputText = (j == 0) ? "Insira o nome da pessoa: ":"Insira a idade da pessoa: ";
                System.out.println(inputText);
                people[i][j] = input.next();
            }

            int personAge = Integer.parseInt(people[i][AGE]);

            if(personAge > higherAge){
                higherAge = personAge;
                higherAgePerson[NAME] = people[i][NAME];
                higherAgePerson[AGE] = people[i][AGE];
            }
        }
        System.out.println("Nome da pessoa mais velha: " + higherAgePerson[NAME] +
                "\nIdade da pessoa mais velha: " + higherAgePerson[AGE]
                );
    }
}
