/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apx2;

/**
 * Implemente um algoritmo em Java que ordene um array com 10 números inteiros.
 * O algoritmo deve efetuar uma comparação de cada elemento com o seu sucessor e
 * se a ordem não for crescente os elementos devem ter suas posições trocadas,
 * este processo deve se repetir até que o array esteja ordenado.
 *
 * @author nicole
 */
public class BubbleSortQuestao1 {

    public static void main(String[] args) {
        int[] vetor = {30, 40, 20, 10, 50, 80, 70, 10, 90, 60, 5};

        int n = vetor.length;// tamanho do vetor
        boolean ordenado = false;// flag: vetor já está ordenado?
        int temp;

        while (!ordenado) {
            ordenado = true;
            for (int i = 0; i < n - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    ordenado = false;
                    temp = vetor[i + 1];//troca elementos fora de ordem
                    vetor[i + 1] = vetor[i];
                    vetor[i] = temp;
                }//if
            }//for
        }//while

        for (int i = 0; i < n; i++) {
            System.out.println(vetor[i]);
        }//for 

    }//main

}//class
