package com.arrayandmatrix;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args){
    final int NUMBER_OF_LINES = intScanner("Digite o número de linhas da pirâmide:");
    final int NUMBER_OF_COLUMNS = numberOfColumns(NUMBER_OF_LINES);
    String[][] emptyMatrix = matrixGenerator(NUMBER_OF_LINES, NUMBER_OF_COLUMNS);
    String[][] pyramidMatrix = pyramidMaker(emptyMatrix, NUMBER_OF_LINES);
    printMatrix(pyramidMatrix);

    }
    public static int intScanner(String consoleOutput){
        Scanner input = new Scanner(System.in);
        System.out.println(consoleOutput);
        int exerciseInputInteger = input.nextInt();

        return exerciseInputInteger;
    }

    public static int numberOfColumns(int numberOfLines){
        int numberOfColumns = (2 * numberOfLines) - 1;

        return numberOfColumns;
    }

    public static String[][] matrixGenerator(int numberOfLines, int numberOfColumns){
        String[][] emptyMatrix = new String[numberOfLines][numberOfColumns];
        for(int i = 0; i < numberOfLines; i++){
            for(int j = 0; j < numberOfColumns; j++ ){
                emptyMatrix[i][j] = " ";
            }
        }

        return emptyMatrix;
    }

    public static String[][] pyramidMaker(String[][] pyramidMatrix, int numberOfLines){
        for(int line = 0; line < numberOfLines; line++){
            int numberOfAsteriksInLine = (2 * (line + 1)) - 1;
            int startColumn = numberOfLines - (line + 1);
            for(int column = startColumn; column < (startColumn + numberOfAsteriksInLine ); column++){
                pyramidMatrix[line][column] = "*";
            }
        }

        return pyramidMatrix;
    }

    public static void printMatrix(String[][] pyramidMatrix){
        for (int line = 0; line < pyramidMatrix.length; line++){
            for(int column = 0; column < pyramidMatrix[line].length; column++){
                System.out.print(pyramidMatrix[line][column]);
            }
            System.out.printf("\n");
        }
    }
}
