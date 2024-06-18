import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while(scanner.hasNextLine()){
            //System.out.println("Wczytałem znak");
            String formularz = scanner.nextLine();
            if(formularz.isEmpty()){
                break;
            }
            czyPoprawny(formularz);
            scanner.reset();
        }
    }

    private static void czyPoprawny(String formularz) {
        String parts[] = podzielTekst(formularz);

        String imie = parts[1].substring(0, parts[1].length()-1);
        String nazwisko = parts[3].substring(0, parts[3].length()-1);
        String data = parts[6];
        //System.out.println(data);

        if(imie(imie) && nazwisko(nazwisko) && data(data)){
            System.out.println("3");
        } else{
            if(!imie(imie)){
                System.out.println("0");
            } else if (!nazwisko(nazwisko)) {
                System.out.println("1");
            } else if (!data(data)) {
                System.out.println("2");
            }
        }
        //System.out.println("Skończyłem swoje");
    }

    private static String[] podzielTekst(String formularz) {
        return formularz.split(" ");
    }

    private static boolean data(String data) {
        boolean czyDobry = true;

        int rok = Integer.parseInt(data.substring(0,4));
        int miesiac = Integer.parseInt(data.substring(6,7));
        int dzien = Integer.parseInt(data.substring(8,10));

        if (!(rok >= 1900 && rok <= 2000 && miesiac >= 1 && miesiac <= 12 && dzien >= 1 && dzien <= 31)) {
            czyDobry = false;
        }
        return czyDobry;
    }

    private static boolean nazwisko(String nazwisko) {
        boolean czyDobry = true;

        for(int j = 0; j < nazwisko.length(); j++){
            if(Character.isLetter(nazwisko.charAt(j)));
            else czyDobry = false;
        }

        if(Character.isUpperCase(nazwisko.charAt(0)));
        else czyDobry = false;

        for (int i = 1; i < nazwisko.length(); i++) {
            if(Character.isLowerCase(nazwisko.charAt(i)));
            else czyDobry = false;
        }
        return czyDobry;
    }

    private static boolean imie(String imie) {
        boolean czyDobry = true;
        for(int j = 0; j < imie.length(); j++){
            if(Character.isLetter(imie.charAt(j)));
            else czyDobry = false;
        }
        return Character.isUpperCase(imie.charAt(0)) && czyDobry;
    }
}