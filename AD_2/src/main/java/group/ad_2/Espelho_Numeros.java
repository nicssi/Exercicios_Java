/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group.ad_2;

/**
 * Receba do usuário uma matriz de números inteiros limitados de 1 a 9. Exiba o
 * seu espelho. Por exemplo, o espelho da matriz: 1 2 4 6 8 9 3 5 é: 6 4 2 1 5 3
 * 9 8
 *
 * @author nicole
 */
import java.util.Scanner;

public class Espelho_Numeros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //criando matriz
        int[][] m = new int[2][4];

        //ler valores da matriz
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Entre o valor da posição[%d][%d]: ", i, j);
                m[i][j] = teclado.nextInt();
            }
        }

        // imprimir matriz original
        System.out.println("Matriz original: ");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d ", m[i][j]);
            }
            System.out.println();
        }

        //imprimir matriz espelhada
        System.out.println("Matriz espelhada: ");

        for (int i = 0; i < 2; i++) {
            for (int j = 3; j >= 0; j--) {
                System.out.printf("%d ", m[i][j]);
            }
            System.out.println();
        }

    }//main
}//class
