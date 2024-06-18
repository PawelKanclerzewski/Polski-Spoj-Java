import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int kolumny = scanner.nextInt();
        int wiersze = scanner.nextInt();
        int[][] kolory = new int[kolumny][wiersze];
        String kolor;

        for(int i = 0; i < wiersze; i++){
            for(int j = 0; j < kolumny; j++){
                kolor = scanner.next();
                kolor = kolor.replace("#", "");
                kolor = kolor.trim();
                kolory[j][i] = Integer.parseInt(kolor, 16);
            }
        }
        int ileObrazow = scanner.nextInt();

        int[][][] obrazy = new int[ileObrazow][kolumny][wiersze];

        for(int k = 0; k < ileObrazow; k++){
            for(int i = 0; i < wiersze; i++){
                for(int j = 0; j < kolumny; j++){
                    kolor = scanner.next();
                    kolor = kolor.replace("#", "");
                    kolor = kolor.trim();
                    obrazy[k][j][i] = Integer.parseInt(kolor, 16);
                }
            }
        }

        for(int i = 0; i < wiersze; i++){
            for(int j = 0; j < kolumny; j++){
                System.out.print(kolory[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------");

        for(int k = 0; k < ileObrazow; k++){
            for(int i = 0; i < wiersze; i++){
                for(int j = 0; j < kolumny; j++){
                    System.out.print(obrazy[k][j][i] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        for(int k = 0; k < ileObrazow; k++){
            for(int i = 0; i < wiersze; i++){
                for(int j = 0; j < kolumny; j++){
                    System.out.print(obrazy[k][j][i] - kolory[j][i] +" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}