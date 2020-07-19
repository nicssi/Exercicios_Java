/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apx2;

/**
 * Escreva um programa em Java que leia um arquivo contendo números inteiros, um
 * por linha, e escreva, num arquivo de saída, a primeira metade dos números
 * lidos, mantendo a ordem de entrada do arquivo original, e a segunda metade
 * escrita de maneira invertida. Por exemplo, se o arquivo de entrada fosse
 * composto dos seguintes números: 1 2 3 4 O arquivo de saída seria: 1 2 4 3 Um
 * exemplo de uso desse programa seria java mudaOrdem arq.txt saida.txt, onde
 * arq.txt é o nome do arquivo de entrada e saida.txt é o nome do arquivo de
 * saída.
 *
 * @author nicole
 */
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;

public class OrdemInversaQuestao4 {

    public static void main(String[] args) throws Exception {
        File entrada = new File("/home/nicole/NetBeansProjects/Apx2/src/main/java/apx2/entrada.txt");
        File saida = new File("/home/nicole/NetBeansProjects/Apx2/src/main/java/apx2/saida.txt");
        Scanner arqEntrada = new Scanner(entrada);
        PrintWriter arqSaida = new PrintWriter(saida);

        int tamanho = 10;//declarando tamanho do vetor
        int vetor[] = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {// ler o arquivo inteiro
            vetor[i] = arqEntrada.nextInt();
        }//for
        for (int i = 0; i < tamanho / 2; i++) {//primeira metade em ordem
            arqSaida.println(vetor[i]);
        }//for
        for (int i = tamanho - 1; i >= tamanho / 2; i--) {
            arqSaida.println(vetor[i]);// segunda metade ordem inversa
        }//for
        arqEntrada.close();
        arqSaida.close();
    }//main

}//class
