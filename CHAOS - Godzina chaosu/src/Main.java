import java.util.Scanner;

public class Main {
    public static int dg, jg, dm, jm;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ileZestawow = scanner.nextInt();

        for(int i = 0; i < ileZestawow; i++) {
            String godzina = scanner.next();
            znajdzNastepnaGodzine(godzina);
        }
    }

    private static void znajdzNastepnaGodzine(String godzina) {

        dg = godzina.charAt(0) - 48;
        jg = godzina.charAt(1) - 48;
        dm = godzina.charAt(3) - 48;
        jm = godzina.charAt(4) - 48;

        zmienGodzine();

        while (!czyPalindrom(dg, jg, dm, jm)) {
            zmienGodzine();
        }
        System.out.println(dg + "" + jg + ":" + dm + "" + jm);
    }

    private static void zmienGodzine() {
        jm++;

        if(jm == 10) {
            jm = 0;
            dm++;
        }
        if(dm == 6) {
            dm = 0;
            jg++;
        }
        if(jg == 10) {
            jg = 0;
            dg++;
        }
        if(dg == 2 && jg == 4 && dm == 0 & jm ==0) {
            dg = 0;
            jg = 0;
        }
    }

    private static boolean czyPalindrom(int dg, int jg, int dm, int jm) {
        if(dg != 0) return dg == jm && jg == dm;
        else {
            if (jg != 0) return jg == jm;
            else {
                if(dm != 0) return dm == jm;
                else {
                    return true;
                }
            }
        }
    }
}