import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static ArrayList<String> czasy = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static int liczbaZawodnikow = scanner.nextInt();
    public static int[][] lapTimes = new int[liczbaZawodnikow][6];

    public static void main(String[] args) {

        for (int i = 0; i < liczbaZawodnikow; i++) {
            for(int j = 0; j < 6; j++){
                lapTimes[i][j] = naSekundy(scanner.next());
            }
            lapTimes[i][3] -= lapTimes[i][2];
            lapTimes[i][2] -= lapTimes[i][1];
            lapTimes[i][1] -= lapTimes[i][0];
        }
        NegativeSplicCount();
    }

    private static void NegativeSplicCount() {
        int ile = 0;
        int ileB = 0;
        int ileReszta = 0;
        int ileResztaTaktyka = 0;

        for(int k = 0; k < liczbaZawodnikow; k++){
            boolean czyNegativ = true;

            for(int l = 1; l < 4; l++){
                if (lapTimes[k][l - 1] < lapTimes[k][l]) {
                    czyNegativ = false;
                    break;
                }
            }

            if(czyNegativ && lapTimes[k][0] > lapTimes[k][3]){
                ile++;
                if(CzyZrealizowalTaktyke(k)){
                    ileB++;
                }
            } else{
                ileReszta++;
                if(CzyZrealizowalTaktyke(k)) ileResztaTaktyka++;
            }
        }

        System.out.println(ileB +"/" + ile + " " + ileResztaTaktyka + "/" + ileReszta);
    }


    private static boolean CzyZrealizowalTaktyke(int k) {
        boolean x;
        if(lapTimes[k][4] < lapTimes[k][5]){
            x = true;
        } else{
            x = false;
        }
        return x;
    }

    private static int naSekundy(String next) {
        int godziny = Integer.parseInt(next.substring(0,2));
        int minuty = Integer.parseInt(next.substring(3,5));
        int sekundy = Integer.parseInt(next.substring(6,8));

        return godziny * 3600 + minuty * 60 + sekundy;
    }
}