package com.letscode.ex1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args){

        Scanner scanNum = new Scanner(System.in);
        System.out.println("Digite um número: ");
        float num1 = scanNum.nextFloat();
        System.out.println("Digite outro número: ");
        float num2 = scanNum.nextFloat();

        float addition = Calculator(num1, num2, "+");
        System.out.printf("A soma entre %.0f e %.0f é %.2f \n", num1, num2, addition);
        float subtraction = Calculator(num1, num2, "-");
        System.out.printf("A subtração entre %.0f e %.0f é %.2f \n", num1, num2, subtraction);
        float multiplication = Calculator(num1, num2, "*");
        System.out.printf("A multiplicação entre %.0f e %.0f é %.2f \n", num1, num2, multiplication);
        float division = Calculator(num1, num2, "/");
        System.out.printf("A divisão entre %.0f e %.0f é %.2f \n", num1, num2, division);
    }

    public static float Calculator(float num1, float num2, String operator){
        float result = 0;
        if(operator == "+") {
            result = num1 + num2;
        }
        if(operator == "-"){
            result = num1 - num2;
        }
        if(operator == "*"){
            result = num1 * num2;
        }
        if(operator == "/"){
            result = num1 / num2;
        }

        return result;
    }
}
