import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ileZawodnikow = scanner.nextInt();

        String imie[] = new String[ileZawodnikow];
        String nazwisko[] = new String[ileZawodnikow];
        String czasBrutto[] = new String[ileZawodnikow];
        String tara[] = new String[ileZawodnikow];
        
        int miejsce[] = new int[ileZawodnikow];
        String czasNetto[] = new String[ileZawodnikow];
        int sekundy[] = new int[ileZawodnikow];


        for(int i = 0; i < ileZawodnikow; i++) {
            imie[i] = scanner.next();
            nazwisko[i] = scanner.next();
            czasBrutto[i] = scanner.next();
            tara[i] = scanner.next();

            czasNetto[i] = wyznaczCzasNetto(czasBrutto[i], tara[i]);
            sekundy[i] = zmienNaSekundy(czasNetto[i]);
            System.out.println(sekundy[i]);
        }

        for(int i = 0; i < ileZawodnikow; i++) {
            miejsce[i] = sekundy.

        }

        for(int i = 0; i < ileZawodnikow; i++) {
            System.out.println();
            System.out.println("CZASY:");
            System.out.println(imie[i]);
            System.out.println(nazwisko[i]);
            System.out.println(czasBrutto[i]);
            System.out.println(tara[i]);
            System.out.println(czasNetto[i]);
        }
    }

    private static String wyznaczCzasNetto(String czasBrutto, String s) {
        int netto = zmienNaSekundy(czasBrutto) - zmienNaSekundy(s);
        return zmienNaFormat(netto);
    }

    private static String zmienNaFormat(int netto) {
        int godziny = netto / 3600;
        int minuty = (netto / 60) % 60;
        int sekundy = netto % 60;

        //System.out.println(godziny + " " + minuty + " " + sekundy);
        String godzina = "";
        String minuta = "";
        String sekunda = "";

        if(godziny < 10) {
            godzina = "0" + godziny;
        } else godzina = String.valueOf(godziny);

        if(minuty < 10) {
            minuta = "0" + minuty;
        } else minuta = String.valueOf(minuty);

        if(sekundy < 10) {
            sekunda = "0" + sekundy;
        } else sekunda = String.valueOf(sekundy);

        return godzina + ":" + minuta + ":" + sekunda;
    }

    private static int zmienNaSekundy(String czasBrutto) {
        char[] czas = czasBrutto.toCharArray();
        int zGodzin, zMinut, zSekund;

        if(czas.length == 8){
            zGodzin = ((czas[0] - 48) * 10 + (czas[1] - 48)) * 60 * 60;
            zMinut = ((czas[3] - 48) * 10 + (czas[4] - 48)) * 60;
            zSekund = ((czas[6] - 48) * 10 + (czas[7] - 48));
        } else {
            zGodzin = 0;
            zMinut = ((czas[0] - 48) * 10 + (czas[1] - 48)) * 60;
            zSekund = ((czas[3] - 48) * 10 + (czas[4] - 48));
        }
        return zGodzin + zMinut + zSekund;
    }
}