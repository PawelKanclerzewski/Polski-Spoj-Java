import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static int ileTestow = scanner.nextInt();
    public static String wyrazenie;

    public static void main(String[] args) {
        for (int i = 0; i < ileTestow; i++) {
            wyrazenie = scanner.next();
            obliczWyrazenie(wyrazenie);
        }
    }

    private static void obliczWyrazenie(String wyrazenie) {
        char[] chars = wyrazenie.toCharArray();
        int suma = Character.getNumericValue(chars[0]);

        for (int i = 1; i < chars.length; i++) {
            if(chars[i] == '+') {
                suma += Character.getNumericValue(chars[i+1]);
            } else suma -= Character.getNumericValue(chars[i+1]);
            i++;
        }
        System.out.println(suma);
    }

}