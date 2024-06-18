import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ileZestawow = scanner.nextInt();

        for(int i = 0; i < ileZestawow; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int koniec = gierka(a, b);
            System.out.println(koniec);
        }
    }

    private static int gierka(int a, int b) {
        int wynik;
        if(a != b) {
            int mniejszy = Math.min(a, b);
            int wiekszy = Math.max(a, b);
            wiekszy -= mniejszy;
            wynik = gierka(mniejszy, wiekszy);
        } else wynik = a + b;
        return wynik;
    }
}