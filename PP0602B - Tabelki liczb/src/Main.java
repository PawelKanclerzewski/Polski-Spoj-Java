import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ileZestawow = scanner.nextInt();
        int l, k;

        for (int i = 0; i < ileZestawow; i++) {
            l = scanner.nextInt();
            k = scanner.nextInt();

            int[][] tab = new int[l][k];

            for (int j = 0; j < l; j++) {
                for (int n = 0; n < k; n++) {
                    tab[j][n] = scanner.nextInt();
                }
            }

            int[][] tab2 = new int[l][k];

            for (int j = 0; j < l; j++) {
                for (int n = 0; n < k; n++) {
                    if (!(n == 0 || n == k - 1 || j == 0 || j == l - 1)) {
                        tab2[j][n] = tab[j][n];
                    } else {
                        if(j == 0 && n != 0) {
                            tab2[j][n - 1] = tab[j][n];
                        }
                        if(n == 0 && j != l - 1) {
                            tab2[j + 1][n] = tab[j][n];
                        }

                        if(j == l - 1) {
                            if(n == k - 1) {
                                tab2[j - 1][n] = tab[j][n];
                            }
                            else tab2[j][n + 1] = tab[j][n];
                        }

                        if(n == k - 1 && j != 0) {
                            tab2[j - 1][n] = tab[j][n];
                        }
                    }
                }
            }

            for (int j = 0; j < l; j++) {
                for (int n = 0; n < k; n++) {
                    System.out.print(tab2[j][n] + " ");
                }
                System.out.println();
            }
        }
    }
}