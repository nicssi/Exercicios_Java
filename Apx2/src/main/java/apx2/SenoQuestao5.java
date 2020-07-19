/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apx2;

import java.util.Scanner;

/**
 * Faça uma função em Java para calcular o valor de seno de x através dos 10
 * primeiros termos da seguinte série: Crie também uma função para calcular o
 * fatorial de um número inteiro para ser utilizada pela função seno. O programa
 * principal deverá receber o valor de x e imprimir o resultado do seno(x).
 *
 * @author nicole
 */
public class SenoQuestao5 {

    public static int fatorial(int n) {//calculando fatorial
        int resultado = 1;

        for (int i = 2; i <= n; i++) {
            resultado = resultado * i;
        }
        return resultado;

    }//fatorial

    public static double seno(double x) {//calculando seno
        double resultado = 0;
        for (int i = 0; i < 10; i++) {
            int n = 2 * i + 1;//números ímpares
            double parcela = Math.pow(x, n) / fatorial(n);

            if (i % 2 == 0) {
                resultado = resultado + parcela;
            } else {
                resultado = resultado - parcela;
            }

        }//for
        return resultado;

    }//seno

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre o valor de x em radianos: ");
        double x = teclado.nextDouble();
        System.out.printf("O seno de %f é %f", x, seno(x));

    }//main
}//class
