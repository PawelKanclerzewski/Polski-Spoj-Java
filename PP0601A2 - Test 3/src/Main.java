import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba, poprzednia = 42;
        int licznik = 0;

        while (scanner.hasNextInt()) {
            liczba = scanner.nextInt();
            System.out.println(liczba);

            if(liczba == 42 && poprzednia != liczba) {
                licznik++;
                if(licznik == 3) {
                    break;
                }
            }
            poprzednia = liczba;
        }

        scanner.close();
    }
}
