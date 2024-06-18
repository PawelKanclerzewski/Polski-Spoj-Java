import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ileZestawow = scanner.nextInt();

        for(int i = 0; i < ileZestawow; i++) {
            int ileLinii = scanner.nextInt();
            int liczba = 0;
            for(int j = 0; j < ileLinii; j++) {
                liczba += scanner.nextInt();
            }
            if(liczba % 2 == 0) System.out.println(2);
            else System.out.println(1);
        }
    }
}