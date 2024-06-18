import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ileZestawow = scanner.nextInt();

        for(int i = 0; i < ileZestawow; i++) {
            int dlugoscKartonu = scanner.nextInt();
            int ileOsob = scanner.nextInt();

            obliczPizze(dlugoscKartonu, ileOsob);
        }
    }

    private static void obliczPizze(int dlugoscKartonu, int ileOsob) {

        double obwod = dlugoscKartonu * Math.PI;

    }
}