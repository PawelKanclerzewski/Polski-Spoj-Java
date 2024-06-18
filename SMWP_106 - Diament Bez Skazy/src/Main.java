import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ileDiamentow = scanner.nextInt();

        for (int i = 0; i < ileDiamentow; i++) {
            int ilePolaczen = scanner.nextInt();
            if (czyGrafBezSkazy(ilePolaczen)) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }
        }
    }

    private static boolean czyGrafBezSkazy(int ilePolaczen) {
        // Oblicz N na podstawie liczby połączeń
        int N = (int) (1 + Math.sqrt(1 + 8 * ilePolaczen)) / 2;

        // Sprawdź, czy liczba połączeń odpowiada grafowi pełnemu o N wierzchołkach
        return N * (N - 1) / 2 == ilePolaczen;
    }
}