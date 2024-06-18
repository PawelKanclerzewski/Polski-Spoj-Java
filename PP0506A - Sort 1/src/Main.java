import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ileZestawow = scanner.nextInt();

        for(int i = 0; i < ileZestawow; i++) {
            int ilePunktow = scanner.nextInt();

            int[] x = new int[ilePunktow], y = new int[ilePunktow];
            String[] nazwa = new String[ilePunktow];
            double[] odleglosc = new double[ilePunktow];

            for(int j = 0; j < ilePunktow; j++) {
                nazwa[j] = scanner.next();
                x[j] = scanner.nextInt();
                y[j] = scanner.nextInt();
                odleglosc[j] = obliczOdleglosc(x[j], y[j]);
            }
            int[] miejsce = new int[ilePunktow];

            for(int k = 0; k < ilePunktow; k++) {
                miejsce[k] = ileLepszych(ilePunktow, odleglosc, k);
            }
            int ileDodanych = 1;

            while(ileDodanych <= ilePunktow) {
                for(int z = 0; z < ilePunktow; z++) {
                    if(miejsce[z] == ileDodanych) {
                        System.out.println(nazwa[z] + " " + x[z] + " " + y[z]);
                        ileDodanych++;
                    }
                }
            }
        }
    }
    private static int ileLepszych(int ilePunktow, double[] s, int k) {
        int iterator = 0;

        for(int i = 0; i < ilePunktow; i++) {
            if(s[k] >= s[i]) iterator++;
        }
        return iterator;
    }
    private static double obliczOdleglosc(int x, int y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}