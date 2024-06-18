import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int ileZestawow = scanner.nextInt();

        for (int i = 0; i < ileZestawow; i++) {
            double r1 = scanner.nextDouble();
            double r2 = scanner.nextDouble();

            System.out.println(Math.round(2 * r1 * r2 * 100) / 100);

            //obliczPole(r1, r2);
        }
        scanner.close();
    }

    private static void obliczPole(double r1, double r2) {
        double pole = 2 * r1 * r2;
        pole = (double) (pole * 100) / 100;
        System.out.println(pole);
    }
}