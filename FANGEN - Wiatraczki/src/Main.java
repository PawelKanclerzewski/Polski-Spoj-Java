import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int r = scanner.nextInt();
            boolean czyPrawoskretny;

            if(r != 0) {
                if(r > 0) {
                    czyPrawoskretny = true;
                } else {
                    czyPrawoskretny = false;
                }
                r = Math.abs(r) * 2;
                String[][] tab = new String[r][r];
                zbudujWiatraczek(tab, czyPrawoskretny, r);
            }
        }
    }

    private static void zbudujWiatraczek(String[][] tab, boolean czyPrawoskretny, int r) {

        tab = wypelnijpole(tab, r);

        tab[0][0] = "*";
        tab[0][r - 1] = "*";
        tab[r - 1][0] = "*";
        tab[r - 1][r - 1] = "*";


        for(int i = 0; i < r; i++) {
            for(int j = 0; j < r; j++) {
                System.out.print(tab[i][j]);
            }
            System.out.println();
        }
    }

    private static String[][] wypelnijpole(String[][] tab, int r) {

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                if (i != 0 && i != r - 1 && j != 0 && j != r - 1) {
                    tab[i][j] = "*";
                } else tab[i][j] = "?";
            }
        }
        return tab;
    }
}