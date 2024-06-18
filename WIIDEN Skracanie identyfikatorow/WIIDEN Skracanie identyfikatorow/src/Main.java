import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static int dlugosc = scanner.nextInt();
    public static String nazwa = scanner.next();
    public static char [] chars = nazwa.toCharArray();
    public static char [] nazwa_liter = new char[nazwa.length()];
    public static int ile_usunietych = 0;
    public static int i = nazwa.length(), j = i, x = i;

    public static void main(String[] args) {

        if(nazwa.length() <= dlugosc){
            System.out.println(nazwa);
        } else{
            usun_nielitery();

            for(int z = 0; z < chars.length; z++){
                if(nazwa_liter[z] != '\0')
                    System.out.print(nazwa_liter[z]);
            }
            System.out.println("");

            if(nazwa.length() - ile_usunietych <= dlugosc){
                System.out.println("OK");

                System.out.println("");
            } else{
                System.out.println("NIE OK");
                usun_cyfry();
            }
            for(int w = 0; w < chars.length; w++){
                if(nazwa_liter[w] != '\0')
                    System.out.print(nazwa_liter[w]);
            }
        }
    }

    private static void usun_cyfry() {
        while (nazwa.length() - ile_usunietych > dlugosc && x > 0){
            if(Character.isDigit(chars[x-1])){
                nazwa_liter[x-1] = '\0';
                ile_usunietych++;
                x--;
            }
        }
    }

    private static void usun_nielitery() {
        while (nazwa.length() - ile_usunietych > dlugosc && i > 0){
            if(Character.isLetter(chars[i-1]) || chars[i-1] == '$' || Character.isDigit(chars[i-1])){
                nazwa_liter[j-1] = chars[i-1];
                System.out.println("Zostawiono literę " + nazwa_liter[j-1] + " w spokoju!");
                i--;
                j--;
            } else{
                System.out.println("Usunięto jedną 'nie literę!': " + chars[i-1]);
                i--;
                ile_usunietych++;
            }
        }
        while(i != 0){
            nazwa_liter[j-1] = chars[i-1];
            i--;
            j--;
        }
    }
}