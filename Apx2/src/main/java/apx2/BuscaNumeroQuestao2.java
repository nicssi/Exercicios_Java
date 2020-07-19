/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apx2;

/**
 * Faça um algoritmo em Java que leia um vetor V de 10 posições e, após,
 * verifica se um número N, fornecido pelo usuário, existe no vetor. Se existir,
 * indicar a(s) posição(ões), senão escrever a mensagem "O número fornecido não
 * existe no vetor!".
 *
 * @author nicole
 */
import java.util.Scanner;

public class BuscaNumeroQuestao2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vetor = new int[10];
        int n;

        System.out.println("Entre os elementos do vetor: ");

        for (int i = 0; i < 10; i++) {
            vetor[i] = teclado.nextInt();
        }//for
        System.out.println("Entre o número a ser buscado: ");
        n = teclado.nextInt();

        boolean achado = false;
        for (int i = 0; i < 10; i++) {// procurar o elemento no vetor
            if (vetor[i] == n) {
                System.out.printf("Achado na posição: %d \n", i);
                achado = true;

            }//if

        }//for
        if (!achado) {
            System.out.println("O número fornecido não"
                    + " existe no vetor!");
        }

    }//main

}//class
