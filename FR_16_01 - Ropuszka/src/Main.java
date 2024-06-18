import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lewo = scanner.nextInt();
        int prawo = scanner.nextInt();
        int dzien = scanner.nextInt();

        if(dzien != 33) {
            if(lewo < prawo) System.out.println("W LEWO");
            if(prawo < lewo) System.out.println("W PRAWO");

        } else System.out.println("WRACAJ");
    }
}