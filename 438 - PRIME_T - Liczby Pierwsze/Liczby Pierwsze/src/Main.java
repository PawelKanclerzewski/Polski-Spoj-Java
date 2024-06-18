import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ile_testow = scanner.nextInt();
        int runda = 0;

        while(runda < ile_testow){
            runda++;
            czy_pierwsza(scanner.nextInt());
        }
    }
    static void czy_pierwsza(int x){
        int dzielnik = 1;
        int ile_dzielnikow = 0;

        while(dzielnik <= x){
            if(x % dzielnik == 0 && x != dzielnik){
                ++ile_dzielnikow;
            }
            dzielnik++;
        }

        if(ile_dzielnikow == 1){
            System.out.println("TAK");
        } else System.out.println("NIE");
    }
}