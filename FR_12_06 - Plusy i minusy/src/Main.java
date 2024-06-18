import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String aktywnosc = scanner.next();

        char[] dane = aktywnosc.toCharArray();
        int wynik = 0;

        for (char c : dane) {
            if (c == '+') wynik++;
            else wynik--;
        }
        int ocena;
        if(wynik >= -2 && wynik <= 2) System.out.println("BRAK");
        else {
            if(wynik > 0) {
                ocena = 5;
            } else {
                ocena = 1;
            }
            wynik = Math.abs(wynik);
            for(int j = 0; j < wynik / 3; j++) {
                System.out.print(ocena + " ");
            }
        }

    }
}