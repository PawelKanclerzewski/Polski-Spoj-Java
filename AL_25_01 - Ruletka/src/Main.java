import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); //liczba pol
        int p = scanner.nextInt(); //numer pierwszego
        int k = scanner.nextInt(); //numer Bonda
        int[] tab = new int[n]; //tablica z polami

        for(int i = 0; i < n; i++) {
            tab[i] = scanner.nextInt();
        }
        int j = 0;
        while(j < n) {
            if(p == k) {
                break;
            }
            else {
                System.out.println("Proba nr " + j + " nieudana");
                System.out.println("Nowa liczba to: " + p + " + " + tab[j]);
                p = p + tab[j];
                System.out.println("Czy " + p + " jest wieksze od " + n);
                j++;
                if(p > n) {
                    p = p % n;
                }
                System.out.println(" = " + p);
                System.out.println();
            }
        }

        if(p == k) {
            System.out.println(j);
        } else System.out.println("Nigdy");
    }
}