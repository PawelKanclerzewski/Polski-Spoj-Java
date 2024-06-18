import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ileZestawow = scanner.nextInt();

        for(int i = 0; i < ileZestawow; i++) {
            int liczbaDziesietna = scanner.nextInt();
            int system = scanner.nextInt();

            zmierzDlugosc(liczbaDziesietna, system);
        }

        scanner.close();
    }

    private static void zmierzDlugosc(int liczbaDziesietna, int system) {
    int dlugosc = 0;
    int liczba = liczbaDziesietna;

    if(liczbaDziesietna >= system) {
        while(liczba != 0) {
            liczba /= system;
            dlugosc++;
        }
    } else dlugosc = 1;

    System.out.println(dlugosc);

    }
}