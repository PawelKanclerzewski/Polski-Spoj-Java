import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int Maciek = scanner.nextInt();
        int ileChceGrzesiek = scanner.nextInt();

        int Grzesiek = 2 * ileChceGrzesiek - Maciek;

        if(Grzesiek >= 15 && Grzesiek <= 30) {
            System.out.println(Grzesiek);
        } else System.out.println("NIE DA SIE");
    }
}