import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // Przechodzi do nowej linii po wczytaniu liczby zestawów danych

        for (int i = 0; i < n; i++) {
            String godzinaStr = scanner.nextLine().trim();
            int wynik = liczUderzeniaDzwonu(godzinaStr);
            System.out.println(wynik);
        }
    }

    private static int liczUderzeniaDzwonu(String godzinaStr) {
        String[] czas = godzinaStr.split(":");
        int godzina = Integer.parseInt(czas[0]);
        int minuta = Integer.parseInt(czas[1]);

        if (godzina == 0) {
            godzina = 24;
        }

        int liczbaUderzen = (godzina % 12) * 12 + minuta / 30;

        return liczbaUderzen;
    }
}
