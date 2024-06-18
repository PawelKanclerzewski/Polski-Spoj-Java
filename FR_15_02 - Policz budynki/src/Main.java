import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ilePytan = scanner.nextInt();

        HashSet<Integer> tab = new HashSet<>();

        for(int i = 0; i < ilePytan; i++) {
            tab.add(scanner.nextInt());
            scanner.next();
        }
        System.out.println(tab.size());
    }
}