/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apx2;

/**
 * Crie um algoritmo em Java que recebe uma matriz (quadrada de ordem 3) de
 * inteiros positivos e substitui seus elementos de valor ímpar por -1 e os
 * pares por +1.
 *
 * @author nicole
 */
public class MatrizInteirosQuestao3 {

    public static void main(String[] args) {
        int matriz[][];
        matriz = new int[][]{{3, 5, 6}, {7, 2, 9}, {5, 1, 4}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] % 2 == 0) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = -1;
                }//else
            }//for
        }//for
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%3d", matriz[i][j]);
            }//for j
            System.out.println();
        }

    }//main

}//class
