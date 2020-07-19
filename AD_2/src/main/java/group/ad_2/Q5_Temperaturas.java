/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group.ad_2;

/**
 * Em uma cidade do interior, sabe-se que de janeiro a abril de 1990 (121 dias)
 * não ocorreu temperatura inferior a 15,5 graus centígrados nem superior a 39,7
 * graus centígrados. Considere um arquivo texto (denominado “temperat.txt”) que
 * contém todas as temperaturas ocorridas nestes 121 dias (uma temperatura por
 * linha). Faça um programa em Java que calcule e apresente: • a menor
 * temperatura ocorrida; • a maior temperatura ocorrida; • a temperatura média;
 * • número de dias nos quais a temperatura foi inferior à temperatura média; •
 * número de dias nos quais a temperatura foi superior à temperatura média.
 *
 *
 * @author nicole
 */
import java.util.Scanner;
import java.io.File;

public class Q5_Temperaturas {

    public static void main(String[] args) throws Exception {
        File f = new File("temperat.txt");
        Scanner entrada = new Scanner(f);

        //criar vetor das temperaturas
        int qt = 121;   
        float dia[] = new float[qt];  
        //ler as temperaturas preenchendo o vetor
        for (int i = 0; i < qt; i++) {
            dia[i] = entrada.nextFloat();
        }//fim for 

        //fechar entrada
        entrada.close();

        //calcular menor, maior e média
        float menor = 100.0f;
        float maior = 0.0f;
        float media;
        float total = 0.0f;

        for (int i = 0; i < qt; i++) {

            // menor até agora?
            if (dia[i] < menor) {
                menor = dia[i];
            }

            //maior até agora?
            if (dia[i] > maior) {
                maior = dia[i];
            }
            // atualizar total
            total += dia[i];
        }//fim for

        media = total / (float) qt;

        int dias_super = 0;
        int dias_infer = 0;

        for (int i = 0; i < qt; i++) {
            if (dia[i] < media) {
                dias_infer++;
            }

            if (dia[i] > media) {
                dias_super++;
            }

        }// fim if

        System.out.printf("A menor temperatura foi: %.2f°C.\n", menor);
        System.out.printf("A maior temperatura foi: %.2f°C.\n", maior);
        System.out.printf("A temperatura média foi: %.2f°C.\n", media);
        System.out.printf(
                "Número de dias com temperatura acima da média: %d.\n",
                dias_super
        );
        System.out.printf(
                "Número de dias com temperatura abaixo da média: %d.\n",
                dias_infer
        );

    }//main

}//class
