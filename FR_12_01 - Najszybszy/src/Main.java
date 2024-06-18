import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> tab = new ArrayList<>();
        int min = Integer.MAX_VALUE, pozycja = 0;

        for(int i = 0; i < 3; i++) {
            tab.add(scanner.nextInt());
            if(min > tab.get(i)) {
                min = tab.get(i);
                pozycja = i;
            }
        }
        int ile = 0;
        for(int k : tab) {
            if(min == k) {
                ile++;
            }
        }

        if(ile == 1) {
            System.out.println("TAK " + (pozycja + 1));
        } else System.out.println("NIE");

    }
}