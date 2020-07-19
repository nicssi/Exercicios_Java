/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group.ad_2;

/**
 * Escreva um programa em Java que, dada uma variável x, retorne o valor de y de
 * acordo com a seguinte regra: se x é par, y = x / 2 se x é impar, y = 3 * x +
 * 1 imprime y O programa deverá atribuir o valor de y em x e continuar até que
 * y tenha valor final igual a 1. Por exemplo, para x = 13, a saída será: 40 ->
 * 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
 *
 * @author nicole
 */
import java.util.Scanner;

public class Collatz {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");//prompt
        int x = teclado.nextInt();
        int y;

        while (x > 1) {
            if (x % 2 == 0) { //hipótese do número digitado ser par
                y = (x / 2);
            } else { //hipótese do número digitado ser ímpar
                y = (x * 3 + 1);
            }
            x = y;

            System.out.printf("y = %d \n", y);//imprimir o valor de y da vez
        }//while

    }// main

}// fim
