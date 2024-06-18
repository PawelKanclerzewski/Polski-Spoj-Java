import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ileWStosie = 0;
        int[] stos = new int[10];

        while (scanner.hasNextLine()) {
            String operacja = scanner.next();

            if (Objects.equals(operacja, "+")) {

                if (ileWStosie < 10 && ileWStosie >= 0) {
                    stos[ileWStosie] = scanner.nextInt();
                    System.out.println(":)");
                    ileWStosie++;
                } else if (ileWStosie == 10) {
                    scanner.nextInt(); // Pomijamy liczbę, bo stos jest pełny
                    System.out.println(":(");
                }
            } else if (Objects.equals(operacja, "-")) {
                if (ileWStosie > 0) {
                    System.out.println(stos[ileWStosie - 1]);
                    ileWStosie--;
                } else if (ileWStosie == 0) {
                    System.out.println(":(");
                }
            }
        }
        scanner.close();
    }
}
