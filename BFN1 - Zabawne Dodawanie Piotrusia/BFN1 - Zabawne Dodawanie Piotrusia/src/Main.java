import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ile_testow = scanner.nextInt();
        int liczba;
        int runda = 1;
        int ile_tur;

        while(runda <= ile_testow){
            runda++;
            ile_tur = 0;
            liczba = scanner.nextInt();

            czy_palindrom(liczba, ile_tur);
        }
    }

    public static void czy_palindrom(int a, int b){

        if (a > 0 && a < 10) {
            System.out.println(a + " " + b);
        } else if (a > 9 && a < 100) {
            if(a / 10 == a % 10){
                System.out.println(a + " " + b);
            } else {

                a = a + ((a % 10) * 10 + a / 10);
                b++;
                czy_palindrom(a, b);

            }
        } else if (a > 99 && a < 1000) {
            if(a / 100 == a % 10){
                System.out.println(a + " " + b);
            } else{
                a = a + ((a % 10) * 100 + a / 100 + (a / 10) % 10 * 10);
                b++;
                czy_palindrom(a, b);

            }
        } else if(a > 999 && a < 10000){
            if(a / 1000 == a % 10 && (a / 10) % 10 == (a / 100) % 10){
                System.out.println(a + " " + b);
            } else {
                a = a + a / 1000 + (a / 100 % 10) * 10 + (a / 10 % 10) * 100 + a % 10 * 1000;
                b++;
                czy_palindrom(a, b);
            }
        } else if(a > 9999 && a < 100000){
            if(a / 10000 == a % 10 && (a / 10) % 10 == (a / 1000) % 10){
                System.out.println(a + " " + b);
            } else {
                a = a + a / 10000 + (a / 1000 % 10) * 10 + (a / 100 % 10) * 100 + (a / 10 )% 10 * 1000 + a % 10 * 10000;
                b++;
                czy_palindrom(a, b);
            }
        } else if(a > 99999 && a < 1000000) {
            if (a / 100000 == a % 10 && (a / 10) % 10 == (a / 10000) % 10 && (a / 100) % 10 == (a / 1000) % 10) {
                System.out.println(a + " " + b);
            } else {
                a = a + a / 100000 + (a / 10000 % 10) * 10 + (a / 1000 % 10) * 1000 + (a / 100) % 10 * 1000 + a / 10 % 10 * 10000 + a %10 * 100000;
                b++;
                czy_palindrom(a, b);
            }
        }
    }
}