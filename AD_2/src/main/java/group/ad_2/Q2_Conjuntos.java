/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group.ad_2;

/**
 * Faça um algoritmo que leia dois conjuntos de números com a mesma quantidade.
 * Exiba a interseção dos conjuntos, ou seja, os números que são repetidos nos
 * dois conjuntos.
 *
 * @author nicole
 */
import java.util.Scanner;

public class Q2_Conjuntos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // quantidade de elementos de cada conjunto
        System.out.println("Digite a quantidade de elementos de cada conjunto:");
        int qt = teclado.nextInt();

        //declarar e ler o primeiro conjunto
        int[] conj_1 = new int[qt];

        System.out.printf("Digite os elementos do primeiro conjunto: \n");

        for (int i = 0; i < qt; i++) {
            System.out.printf("Digite o elemento %d: ", i + 1);
            conj_1[i] = teclado.nextInt();

        }// for primeiro cnj

        // declarar e ler o segundo conjunto
        int[] conj_2 = new int[qt];

        System.out.printf("Digite os elementos do segundo conjunto: \n");

        for (int i = 0; i < qt; i++) {
            System.out.printf("Digite o elemento %d: ", i + 1);
            conj_2[i] = teclado.nextInt();

        }//for segundo cnj

        //interseção dos cnjts
        System.out.println("Interseção:");

        // para cada elemento do 1° conj buscar no 2° conj
        for (int i = 0; i < qt; i++) {

            for (int j = 0; j < qt; j++) {

                if (conj_1[i] == conj_2[j]) {

                    System.out.printf("%d \n", conj_1[i]);
                }

            }
        }

    }//main
}//class
