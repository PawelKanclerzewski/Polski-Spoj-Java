import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String wejscie = scanner.next();
        Zmien(wejscie);
        System.out.println();
    }

    private static void Zmien(String wejscie) {

        if(czyLiczby(wejscie)) {
            ArrayList<Integer> liczby = new ArrayList<>();
            char pies[] = wejscie.toCharArray();
            for (int i = 0; i < wejscie.length(); i++) {
                liczby.add((int) pies[i] - 48);
            }

            zmienNaZnaki(liczby);

        } else {
            ArrayList<String> znaki = new ArrayList<>();
            char cos[]  = wejscie.toCharArray();
            for (int i = 0; i < wejscie.length(); i++) {
                znaki.add(String.valueOf(cos[i]));
            }

            zmienNaCyfry(znaki);
        }
    }

    private static void zmienNaCyfry(ArrayList<String> wejscie) {
        ArrayList<Integer> cyfryOdp = new ArrayList<>();

        for (int i = 4; i < wejscie.size(); i++) {
            if(Objects.equals(wejscie.get(i), wejscie.get(i - 1))) {
                cyfryOdp.add(0);
            } else {
                cyfryOdp.add(1);
            }
        }

        for(int k : cyfryOdp) {
            System.out.print(k);
        }
    }

    private static void zmienNaZnaki(ArrayList<Integer> wejscie) {
        ArrayList<String> odpowiedz = new ArrayList<>();

        for(int i = 0; i < 4; i++) {
            odpowiedz.add("D");
        }

        for (int i = 0; i < wejscie.size(); i++) {
            String ostatniElement = odpowiedz.get(odpowiedz.size() - 1);

            if(wejscie.get(i) == 1) {
                if(ostatniElement == "D") {
                    odpowiedz.add("G");
                } else {
                    odpowiedz.add("D");
                }
            } else if(ostatniElement == "D") {
                odpowiedz.add("D");
            } else {
                odpowiedz.add("G");
            }
        }
        for (String s : odpowiedz) {
            System.out.print(s);
        }
    }
    private static boolean czyLiczby(String wejscie) {
        return wejscie.chars().allMatch(Character::isDigit);
    }
}