import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ileZestawow = scanner.nextInt();

        for (int i = 0; i < ileZestawow; i++) {
            int ileOsob = scanner.nextInt();
            ArrayList<Integer> lista = new ArrayList<>();
            ArrayList<Integer> wynik = new ArrayList<>();

            for (int j = 0; j < ileOsob; j++) {
                lista.add(scanner.nextInt());
            }
            int max = Collections.max(lista);

            for (Integer k : lista) {
                if(k == max) wynik.add(k);
            }
            Collections.sort(lista);

            for (Integer l : lista) {
                if(l != max) wynik.add(l);
            }
            StringBuilder pies = new StringBuilder("");

            for(Integer m : wynik) {
                pies.append(m).append(" ");
            }
            System.out.println(pies);
        }
    }
}