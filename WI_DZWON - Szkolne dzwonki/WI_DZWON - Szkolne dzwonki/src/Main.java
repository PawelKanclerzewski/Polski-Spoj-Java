import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String godzina_start = scanner.next();
        char start[] = godzina_start.toCharArray();
        int sm = ((start[0] - 48) * 10 + (start[1] - 48)) * 60 + (start[3] - 48) * 10 + start[4] - 48;
        int ilePrzerw = 0;

        ArrayList<Integer> przerwy = new ArrayList<>();
        while (scanner.hasNextInt()) {
            int dlugoscPrzerwy = scanner.nextInt();
            przerwy.add(dlugoscPrzerwy);
            ilePrzerw++;
        }
        scanner.close();

        obliczPrzerwy(sm, ilePrzerw, przerwy);

        System.out.println(sm);
        System.out.println();
        System.out.println(przerwy);
        System.out.println("liczba przerw: " + ilePrzerw);
    }

    public static void obliczPrzerwy(int a, int b, ArrayList c) {
        System.out.println(a);
        int nastepna;
        for(int i = 0; i < b; i++){
            nastepna = a +
        }
    }
}