import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int liczbaZestawow = scanner.nextInt();

        for(int i = 0; i < liczbaZestawow; i++){
            int ilePunktow = scanner.nextInt();
            double dystans = 0.0;
            int[] x = new int[ilePunktow];
            int[] y = new int[ilePunktow];

            for(int j = 0; j < ilePunktow; j++){
                x[j] = scanner.nextInt();
                y[j] = scanner.nextInt();
            }
            for(int k = 1; k < ilePunktow; k++){
                dystans += sqrt(pow(x[k] - x[k-1], 2) + pow(y[k] - y[k-1],2));
            }
            dystans = (double) (round(dystans / 10) * 10);
            System.out.println(dystans / 1000);
        }
    }