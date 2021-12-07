package com.letscode.ex3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
    Scanner temperature = new Scanner(System.in);
    System.out.print("Insira a temperatura em graus Celsius: ");
    float celsius = temperature.nextFloat();
    float fahr = Converter(celsius);
    System.out.printf("%.2fºC são %.2fºF", celsius, fahr);
    }

    public static float Converter(float celsius){
        float fahr = (celsius * 9/5) + 32;
        return fahr;
    }
}
