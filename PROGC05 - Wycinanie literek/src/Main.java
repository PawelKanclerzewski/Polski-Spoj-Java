import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String literka = scanner.next();
            String slowo = scanner.next();
            StringBuilder odpowiedz = new StringBuilder();

            for (int i = 0; i < slowo.length(); i++) {
                if (slowo.charAt(i) != literka.charAt(0)) {
                    odpowiedz.append(slowo.charAt(i));
                }
            }
            System.out.println(odpowiedz);
        }

        scanner.close();
    }
}
