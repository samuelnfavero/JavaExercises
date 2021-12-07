package com.letscode.ex5;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        Scanner measures = new Scanner(System.in);
        System.out.print("Insira o valora em polegadas: ");
        float inches =measures.nextFloat();
        float centimeters = Converter(inches);
        System.out.printf("%.2f polegadas são %.2f centimetros", inches, centimeters);
    }

    public static float Converter(float inches){
    return (float) (inches*2.54);
    }
}
