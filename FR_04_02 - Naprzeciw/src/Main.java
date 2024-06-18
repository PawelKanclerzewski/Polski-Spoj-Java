import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ileZapytan = scanner.nextInt();

        for (int i = 0; i < ileZapytan; i++) {
            int ileOsob = scanner.nextInt();
            int numerOsoby = scanner.nextInt();
            System.out.println(znajdzNaprzeciw(ileOsob, numerOsoby));
        }
        scanner.close();

    }

    private static String znajdzNaprzeciw(int ileOsob, int numerOsoby) {
        if(ileOsob % 2 == 0) {
            int polowa = ileOsob / 2;
            if(numerOsoby > polowa) {
                return String.valueOf(numerOsoby - polowa);
            } else return String.valueOf(numerOsoby + polowa);
        } else return "BRAK";
    }
}
