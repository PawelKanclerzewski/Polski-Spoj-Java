import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static String[] nazwa = new String[7];

    public static void main(String[] args) {
        nazwa[0] = "#";
        Scanner scanner = new Scanner(System.in);
        int liczbaZestawow = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < liczbaZestawow; i++){
            String inputLine = scanner.nextLine();
            String[] values = inputLine.split(" ");
            int rr = Integer.parseInt(values[0]);
            int gg = Integer.parseInt(values[1]);
            int bb = Integer.parseInt(values[2]);

            zmienNaSzesnastkowy(rr, 1);
            zmienNaSzesnastkowy(gg, 3);
            zmienNaSzesnastkowy(bb, 5);

            StringBuilder nazwaScalona = new StringBuilder();
            for(int k = 0; k < 7; k++){
                nazwaScalona.append(nazwa[k]);
            }
            if(Objects.equals(nazwaScalona.toString(), "#000000") ||Objects.equals(nazwaScalona.toString(), "#C0C0C0") ||
                    Objects.equals(nazwaScalona.toString(), "#808080") || Objects.equals(nazwaScalona.toString(), "#FFFFFF") ||
                    Objects.equals(nazwaScalona.toString(), "#800000") || Objects.equals(nazwaScalona.toString(), "#FF0000") ||
                    Objects.equals(nazwaScalona.toString(), "#800080") || Objects.equals(nazwaScalona.toString(), "#FF00FF") ||
                    Objects.equals(nazwaScalona.toString(), "#008000") || Objects.equals(nazwaScalona.toString(), "#00FF00") ||
                    Objects.equals(nazwaScalona.toString(), "#808000") || Objects.equals(nazwaScalona.toString(), "#FFFF00") ||
                    Objects.equals(nazwaScalona.toString(), "#000080") || Objects.equals(nazwaScalona.toString(), "#0000FF") ||
                    Objects.equals(nazwaScalona.toString(), "#008080") || Objects.equals(nazwaScalona.toString(), "#00FFFF")){
                czyStandardowy(nazwaScalona.toString());
            } else{
                for(int j = 0; j < 7; j++){
                    System.out.print(nazwa[j]);
                }
                System.out.println();
            }
        }
    }

    private static void czyStandardowy(String nazwa) {
        switch (nazwa){
            case "#000000":
                System.out.println("black");
                break;

            case "#C0C0C0":
                System.out.println("silver");
                break;

            case "#808080":
                System.out.println("gray");
                break;

            case "#FFFFFF":
                System.out.println("white");
                break;

            case "#800000":
                System.out.println("maroon");
                break;

            case "#FF0000":
                System.out.println("red");
                break;

            case "#800080":
                System.out.println("purple");
                break;

            case "#FF00FF":
                System.out.println("fuchsia");
                break;

            case "#008000":
                System.out.println("green");
                break;

            case "#00FF00":
                System.out.println("lime");
                break;

            case "#808000":
                System.out.println("olive");
                break;

            case "#FFFF00":
                System.out.println("yellow");
                break;

            case "#000080":
                System.out.println("navy");
                break;

            case "#0000FF":
                System.out.println("blue");
                break;

            case "#008080":
                System.out.println("teal");
                break;

            case "#00FFFF":
                System.out.println("aqua");
                break;


        }
    }

    public static void zmienNaSzesnastkowy(int x, int pozycja){
        int jeden = x / 16;
        String jedenS = "";

        int dwa = x - (x / 16) * 16;
        String dwaS = "";

        if(jeden < 10){
            jedenS = String.valueOf(jeden);
        } else jedenS = zmienNaLitere(jeden);

        if(dwa < 10){
            dwaS = String.valueOf(dwa);
        } else dwaS = zmienNaLitere(dwa);

        nazwa[pozycja] = jedenS;
        nazwa[pozycja + 1] = dwaS;
    }

    private static String zmienNaLitere(int x) {
        String y ="";
            switch (x){
                case 10:
                    y = "A";                    break;

                case 11:
                    y = "B";                    break;

                case 12:
                    y = "C";                    break;

                case 13:
                    y = "D";                    break;

                case 14:
                    y = "E";                    break;

                case 15:
                    y = "F";                    break;
            }
        return y;
    }
}