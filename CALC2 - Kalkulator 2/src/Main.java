import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static int[] rejestr = new int[10];
    public static String[] dzialanie = new String[10];

    public static void main(String[] args) {
        while(scanner.hasNext()) {

           String operacja = scanner.next();
           int a  = scanner.nextInt();
           int b = scanner.nextInt();

            if(!Objects.equals(operacja, "z")) {
                wykonajdzialanie(a , b , operacja);
            } else {
                rejestr[a] = b;
                dzialanie[a] = operacja;
            }
        }
    }

    private static void wykonajdzialanie(int a, int b, String operacja) {
        int wynik = 0;
        switch (operacja) {
            case "+":
                wynik = rejestr[a] + rejestr[b];
                break;
            case "-":
                wynik = rejestr[a] - rejestr[b];
                break;
            case "/":
                wynik = rejestr[a] / rejestr[b];
                break;
            case "%":
                wynik = rejestr[a] % rejestr[b];
                break;
            case "*":
                wynik = rejestr[a] * rejestr[b];
                break;
        }
        System.out.println(wynik);
    }
}