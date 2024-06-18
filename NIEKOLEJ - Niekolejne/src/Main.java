import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

    public static StringBuilder napis = new StringBuilder("");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();

        if (liczba > 4) {
            wypisz(liczba);
        } else {
            napis.append("NIE");
        }
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            writer.write(String.valueOf(napis));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void wypisz(int size) {
        int x = 0;

         do {
            napis.append(x).append(" ");
            x += 2;
        } while (x <= size);

         x = 1;

         do {
            napis.append(x).append(" ");
            x += 2;
        } while (x <= size);
    }
}
