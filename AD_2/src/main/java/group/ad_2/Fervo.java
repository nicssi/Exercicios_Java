/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group.ad_2;

/**
 *
 * @author nicole
 */
import java.util.Random;
import java.io.PrintWriter;
import java.io.File;

public class Fervo {

    public static void main(String[] args) throws Exception {

        File f = new File("temperat.txt");
        PrintWriter pw = new PrintWriter(f);
        Random rand = new Random();
        float tmin = 15.5f;
        float tmax = 39.7f;

        for (int i = 0; i < 121; i++) {

            float temperatura = tmin + rand.nextFloat() * (tmax - tmin);

            pw.printf("%.2f\n", temperatura);

        }

        pw.close();

    }

}
