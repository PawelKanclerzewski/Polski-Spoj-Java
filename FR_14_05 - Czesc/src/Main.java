import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ileOsob = scanner.nextInt();
        ArrayList<Integer> tab = new ArrayList<>();

        for(int i = 0; i < ileOsob; i++) {
            tab.add(scanner.nextInt());
        }

        int ilePrzywitan = 0;
        Collections.sort(tab);

        for(int j = 0; j < ileOsob; j++) {
            boolean czyPowitalNawejscie = false;
            int ilePozniej = 0;

            for(int k = 0; k < ileOsob; k++) {
                if(j != k) {
                    if(tab.get(j) < tab.get(k)) ilePozniej++;
                    if(tab.get(j) >= tab.get(k)) czyPowitalNawejscie = true;
                }
            }

            if(czyPowitalNawejscie) ilePozniej++;
            System.out.println("Dla " + tab.get(j) + " liczba przywitan równa się: " + ilePozniej);

            ilePrzywitan += ilePozniej;
        }
        System.out.println(ilePrzywitan);
    }
}