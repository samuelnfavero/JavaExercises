package com.letscode.ex4;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        Scanner values = new Scanner(System.in);
        System.out.print("Insira a cotação do dolar no dia: ");
        float dollarPrice = values.nextFloat();
        System.out.print("Insira o valor em reais que deseja converter: ");
        float reais = values.nextFloat();
        float dollars = Converter(dollarPrice, reais);
        System.out.printf("R$ %.2f reais são $ %.2f Dólares", reais, dollars);
    }
    public static float Converter(float price, float reais){
        return reais/price;
    }
}
