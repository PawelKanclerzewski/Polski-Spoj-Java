import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String jasio = scanner.next();
        String stasio = scanner.next();

        String[] jasioSplit = jasio.split("");
        String[] stasioSplit = stasio.split("");

        ArrayList<String> jasioList = new ArrayList<String>(Arrays.asList(jasioSplit));
        ArrayList<String> stasioList = new ArrayList<String>(Arrays.asList(stasioSplit));

        int jasioPoints = 0;
        int stasioPoints = 0;

        for(String k: jasioList){
            jasioPoints += ilePunktow(k);
        }

        for(String k: stasioList){
            stasioPoints += ilePunktow(k);
        }

        if(jasioPoints > stasioPoints) System.out.println("JASIO");
        else if(jasioPoints < stasioPoints) System.out.println("STASIO");
        else System.out.println("REMIS");
    }

    private static int ilePunktow(String k) {
        int z = 0;
        if(Objects.equals(k, "T") || Objects.equals(k, "J") || Objects.equals(k, "Q") ||
                Objects.equals(k, "K") || Objects.equals(k, "A")){

            switch (k) {
                case "T":
                    z = 10;
                    break;
                case "J":
                    z = 11;
                    break;
                case "Q":
                    z = 12;
                    break;
                case "K":
                    z = 13;
                    break;
                case "A":
                    z = 14;
                    break;
            }
        } else z = Integer.parseInt(k);
        return z;
    }
}