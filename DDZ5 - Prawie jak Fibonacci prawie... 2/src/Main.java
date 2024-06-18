import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ileLiczb = scanner.nextInt();
        ArrayList<Integer> tab = new ArrayList<>();

        for(int i = 0; i < ileLiczb; i++) {
            tab.add(scanner.nextInt());
        }
        int ile = 0;

        for(int i = 2; i < ileLiczb; i++) {
            if(tab.get(i - 2) + tab.get(i - 1) == tab.get(i)) {
                ile++;
            }
        }
        System.out.println(ile);
    }
}