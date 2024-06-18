import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ileZestawow = scanner.nextInt();

        while(ileZestawow > 0) {
            int liczba = scanner.nextInt();
            if(czyKwadrat(liczba)) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }
            ileZestawow--;
        }
    }

    private static boolean czyKwadrat(int liczba) {
        if(liczba <= 0) return false;
        else {
            if(Math.sqrt(liczba) % 1 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }
}