/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group.ad_2;

/**
 * Implemente a lógica para realização de saques em um caixa eletrônico
 * considerando que o mesmo armazena cédulas de R$100,00, R$50,00, R$20,00,
 * R$10,00, R$5,00, R$2,00 e R$1,00 e devem ser entregues ao cliente o menor
 * número possível de cédulas.
 *
 * @author nicole
 */
import java.util.Scanner;

public class Caixa_Eletronico {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor a ser retirado: "); // prompt
        var valor = teclado.nextInt();

        int temp = valor;

        int n_100 = 0;// daclaração das variaveis de qt de notas
        int n_50 = 0;
        int n_20 = 0;
        int n_10 = 0;
        int n_5 = 0;
        int n_2 = 0;
        int n_1 = 0;

        while (temp >= 100) { // notas de 100
            temp = (temp - 100);
            n_100++;

        }// while >=100

        while (temp >= 50) { // notas de 50
            temp = (temp - 50);
            n_50++;

        }// while >=50

        while (temp >= 20) { // notas de 20
            temp = (temp - 20);
            n_20++;

        }// while >=20

        while (temp >= 10) { // notas de 10
            temp = (temp - 10);
            n_10++;

        }// while >=10

        while (temp >= 5) { // notas de 5
            temp = (temp - 5);
            n_5++;

        }// while >=5

        while (temp >= 2) { // notas de 2
            temp = (temp - 2);
            n_2++;

        }// while >=2

        while (temp >= 1) { // notas de 1
            temp = (temp - 1);
            n_1++;

        }// while >=1

        System.out.printf(
                "Serão entregues:\n" + 
                        "%d notas de 100 \n" + 
                        "%d notas de 50\n" +
                        "%d notas de 20\n" + 
                        "%d notas de 10\n"+ 
                        "%d notas de 5\n" + 
                        "%d notas de 2\n" + 
                        "%d notas de 1",
                n_100, n_50, n_20, n_10, n_5, n_2, n_1);

    }//main

}//fim
